package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/cd.exe");
		WebDriver driver=new ChromeDriver();//launches browser
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		WebElement listBox = driver.findElement(By.id("month"));
		Select select=new Select(listBox);
		select.selectByValue("6");
		Thread.sleep(5000);
		select.selectByIndex(3);
		Thread.sleep(5000);
		select.selectByVisibleText("May");
		
}
}