package com.qa.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/cd.exe");
		WebDriver driver=new ChromeDriver();//launches browser
		driver.manage().window().maximize();
		driver.get("http://62.212.73.18:8080/EhatEnterprise/");
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());
		for(int i=0;i<linkList.size();i++) {
			String linkText=linkList.get(i).getText();
			System.out.println(linkText);
		}
			
}
}