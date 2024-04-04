package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators
{
  public static void main(String[] args) throws InterruptedException
  {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.linkText("BOOKS")).click();//In inktext we have to give web page BOOKS
	//not from html DOM (document object module) Books bcz it will click on categories Books

	driver.findElement(By.linkText("DIGITAL DOWNLOADS")).click();//only DIGITAL is also enough to run
	
	driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("BOOKS");  
	
	driver.findElement(By.xpath("/html/body/div/div/div/div/form/input[1]")).sendKeys("BOOKS");
	driver.get("https://www.amazon.com/");
	driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[3]/div/div[1]/div/div/div[2]/div[1]/ul[1]/li[1]/span[1]/a[1]")).click();
}
}
