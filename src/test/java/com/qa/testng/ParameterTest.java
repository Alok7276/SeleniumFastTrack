package com.qa.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTest {
WebDriver driver;
@Test
@Parameters({"browser","url","emailId","password"})

public void crmLoginTest(String browser,String url,String emailId,String password) {
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(browser.equals("ff")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	driver.get(url);
	driver.findElement(By.name("username")).sendKeys(emailId);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}
}
