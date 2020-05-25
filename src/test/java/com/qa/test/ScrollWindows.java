package com.qa.test;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollWindows {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://news.google.com/topstories?hl=en-IN&gl=IN&ceid=IN:en");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	for(int i=0;i<10;i++) {
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
	}
}
}
