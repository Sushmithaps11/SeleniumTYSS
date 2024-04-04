package com.selenium.actionsclass;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/books");
	WebElement computersLink = driver.findElement(By.partialLinkText("COMPUTERS"));
	Actions action=new Actions(driver);
	action.moveToElement(computersLink).build().perform();
	action.moveToElement(driver.findElement(By.partialLinkText("Desktops"))).click().perform();
}
}
