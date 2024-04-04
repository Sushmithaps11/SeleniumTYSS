package com.selenium.popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp
{
  public static void main(String[] args) throws InterruptedException
  {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/User/Downloads/MultipleWindow.html");
	System.out.println(driver.getWindowHandle());
	driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
	
	Thread.sleep(4000);
	
	Set<String> childWindow = driver.getWindowHandles();
	for (String window : childWindow) 
	{
		driver.switchTo().window(window);
		//driver.close();--if we give close here it will closes all the window
		if(driver.getTitle().contains("Olive"))//to close particular window
		{
			driver.close();
		}
  }
	}
}
