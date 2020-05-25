package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {
public static void main(String[] args) {
	//WebDriverManager.chromedriver().setup();
	WebDriverManager.iedriver().setup();
	//WebDriver driver=new ChromeDriver();
	WebDriver driver=new InternetExplorerDriver();
	driver.get("http://www.google.com");
	driver.close();
}
}
