package com.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/cd.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("http://62.212.73.18:8080/EhatEnterprise/");
	driver.findElement(By.id("userName")).sendKeys("admin");
}
}
