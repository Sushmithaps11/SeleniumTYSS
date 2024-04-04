package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1
{
   public static void main(String[] args)
   {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.amazon.in/");
	//driver.findElement(By.name("field-keywords")).sendKeys("Samsung");
	//driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath("//h2[text()='Appliances for your home | Up to 55% off']/../..//span[text()='Air conditioners']")).click();
	
}
}