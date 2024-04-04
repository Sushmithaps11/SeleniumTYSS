package com.selenium.actionsclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/");
	Actions action = new Actions(driver);
	action.sendKeys(Keys.PAGE_DOWN).perform();
	action.keyDown(Keys.PAGE_DOWN).perform();
	action.keyDown(Keys.PAGE_DOWN).perform();
	Thread.sleep(2000);
	action.keyUp(Keys.PAGE_UP).perform();
}
}
