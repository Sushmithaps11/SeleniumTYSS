package com.selenium.popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabSelenium
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://github.com/");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.selenium.dev/");
	
	Set<String> windows = driver.getWindowHandles();
	for (String window : windows)
	{
		driver.switchTo().window(window);
		Thread.sleep(3000);
		if(driver.getTitle().contains("Demo Web Shop"))
		{
			driver.findElement(By.partialLinkText("BOOKS")).click();
		}
	}
}
}
