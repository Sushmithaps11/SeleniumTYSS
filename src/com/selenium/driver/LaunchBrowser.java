package com.selenium.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser
{
  public static void main(String[] args)
  {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("");
    System.out.println(driver.getPageSource());
    
}
}
