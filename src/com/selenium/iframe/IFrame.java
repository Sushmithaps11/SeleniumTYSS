package com.selenium.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame
{
  public static void main(String[] args) throws InterruptedException
  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/User/Downloads/iframe.html");
	
	Thread.sleep(3000);
	//driver.switchTo().frame(1); index
	//driver.switchTo().frame("frame1"); name
	//driver.switchTo().frame("FR1");id
	driver.switchTo().frame(driver.findElement(By.id("FR1")));//webelement
	driver.findElement(By.partialLinkText("INDIA")).click();
	//driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("Google"));
}
}
