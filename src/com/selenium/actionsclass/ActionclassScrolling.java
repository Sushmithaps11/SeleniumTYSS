package com.selenium.actionsclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionclassScrolling
{
  public static void main(String[] args)
  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/");
	Actions action=new Actions(driver);
	action.scrollByAmount(0, 500);
}
}
