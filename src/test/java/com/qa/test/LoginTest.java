package com.qa.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fip = new FileInputStream(
				"D:\\Automation\\SeleniumFastrackCourse\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(fip);
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/cd.exe");
			driver = new ChromeDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id("userName")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("SignIn")).click();
	}
}
