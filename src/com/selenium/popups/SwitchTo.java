package com.selenium.popups;

import java.util.Set;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo
{
   public static void main(String[] args)
   {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.xpath("//a[text()='Open Tab']")).click();
	
	Set<String> windows = driver.getWindowHandles();
	
	for (String window : windows)
		
	{
		String Title = driver.switchTo().window(window).getTitle();
		if(Title.contains("QAClick Academy"))
		{
			break;
		}
	}
	driver.findElement(By.linkText("Courses")).click();
	
	driver.findElement(By.xpath("//div[text()='Total students']/following-sibling::div")).getText();
}
}
