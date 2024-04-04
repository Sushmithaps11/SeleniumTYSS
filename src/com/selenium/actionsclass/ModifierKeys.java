package com.selenium.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ModifierKeys
{
   public static void main(String[] args) throws InterruptedException 
   {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	WebElement downloads=driver.findElement(By.xpath("//span[text()='Downloads']"));
	WebElement documentation=driver.findElement(By.xpath("(//span[text()='Documentation'])[1]"));
	
	Actions action = new Actions(driver);
	action.keyDown(Keys.CONTROL).perform();
	action.click(downloads).perform();
	Thread.sleep(2000);
	action.click(documentation).perform();
}
}
