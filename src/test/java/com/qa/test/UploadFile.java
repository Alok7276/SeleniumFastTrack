package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/cd.exe");
		WebDriver driver=new ChromeDriver();//launches browser
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		//driver.findElement(By.xpath("//label[@data-uba-click='UploadCVClick']")).sendKeys("D:\\studymaterial\\SQL.pdf");
		driver.findElement(By.id("myFile")).sendKeys("D:\\studymaterial\\\\SQL.pdf");
	}
}