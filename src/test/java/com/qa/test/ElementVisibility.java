package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibility {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/cd.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://62.212.73.18:8080/EhatEnterprise/");
		boolean b1 = driver.findElement(By.name("Action")).isEnabled();
		System.out.println(b1);
		boolean b2 = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println(b2);
	}
}