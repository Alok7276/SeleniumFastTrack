package com.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameConcept {
	public static void main(String[] args) {

		WebDriver chromeDriver = initialiseChromeDriver();
		// driver.get("https://www.crmpro.com/");
		excuteTest(chromeDriver);
		// driver.findElement(By.linkText("Logout")).click();

	}

	private static void excuteTest(WebDriver driver) {
		openSite(driver, "https://www.crmpro.com/");
		login(driver, "alok4u", "iamalok");
		switchToPage(driver);
	}

	private static WebDriver initialiseChromeDriver() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

	private static WebDriver initialiseMozillaDriver() {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

	private static void switchToPage(WebDriver driver) {
		driver.switchTo().frame("mainpanel");
	}

	private static void login(WebDriver driver, String user, String pass) {
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	private static void openSite(WebDriver driver, String url) {
		driver.navigate().to(url);
	}
}
