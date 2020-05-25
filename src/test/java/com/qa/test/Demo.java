package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/cd.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("alok4u");
		driver.findElement(By.name("password")).sendKeys("iamalok");
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		driver.switchTo().frame("mainpanel");
        WebElement V=driver.findElement(By.xpath("//a[.='Contacts']"));
        Actions av=new Actions(driver);
        av.moveToElement(V).perform();
        driver.findElement(By.xpath("//a[.='New Contact']")).click();
        WebElement title = driver.findElement(By.name("title"));
		Select select=new Select(title);
		select.selectByVisibleText("Mr.");
        
	}

}
