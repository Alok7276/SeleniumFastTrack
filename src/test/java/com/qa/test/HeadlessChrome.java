package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/cd.exe");
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--headless");
	WebDriver driver=new ChromeDriver(co);
	driver.get("http://www.google.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
}
}
