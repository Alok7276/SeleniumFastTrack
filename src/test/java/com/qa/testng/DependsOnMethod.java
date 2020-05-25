package com.qa.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsOnMethod {

	@Test
	public void loginTest() {
		System.out.println("Hello");
		Assert.fail();
	}
	@Test(dependsOnMethods= {"loginTest"})
	public void logoutTest() {
		System.out.println("world");
	}
	
}