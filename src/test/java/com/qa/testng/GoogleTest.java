package com.qa.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
WebDriver driver;
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test(priority=1)
	public void titleTest() {
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Google");
		
	}
	@Test(priority=2)
	public void gmailLinkTest() {
		boolean b1 = driver.findElement(By.linkText("Gmail")).isDisplayed();
		Assert.assertEquals(b1, true);
	}
}
