package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/cd.exe");
		WebDriver driver=new ChromeDriver();//launches browser
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		WebElement recruiter = driver.findElement(By.xpath("//div[.='Recruiters']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(recruiter).perform();
		
		driver.findElement(By.xpath("//a[.='Browse All Recruiters']")).click();
}
}