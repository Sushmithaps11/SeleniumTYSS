package com.selenium.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightandDoubleClick
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Actions action = new Actions(driver);
	action.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).build().perform();//contextclickmethod means rightclickmethod
	Thread.sleep(2000);
	action.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).perform();
}
}
