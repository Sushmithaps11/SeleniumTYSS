package com.selenium.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationsPopUp
{
  public static void main(String[] args)
  {
	  //to avoid popup
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--disable-notifications");
	 // options.addArguments("--headless");//it wil run in backend but we cant see browser runnning physically
	//  options.addArguments("start-maximized");
	//  options.addArguments("--incognito");
	  
	WebDriver driver=new ChromeDriver(options);
	
	driver.manage().window().maximize();
	System.out.println("Browser is open");
	driver.get("https://www.irctc.co.in/nget/train-search");
	System.out.println("Url is launched");
}
}
