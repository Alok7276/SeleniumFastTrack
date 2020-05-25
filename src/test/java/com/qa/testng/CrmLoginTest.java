package com.qa.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrmLoginTest {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com/");
	}

	@DataProvider(name = "getLoginData")
	public Object[][] getLoginData() {
		Object loginData[][] = TestUtil.getData("login");
		return loginData;
	}

	@Test(dataProvider = "getLoginData")
	public void crmLogin(String username, String password) throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(5000);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
