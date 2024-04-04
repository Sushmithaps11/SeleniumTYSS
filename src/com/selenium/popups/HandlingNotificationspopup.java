package com.selenium.popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNotificationspopup 
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		//to handle popups
		 WebDriver driver = new ChromeDriver();
         driver.get("https://www.irctc.co.in/nget/train-search");
  
         Thread.sleep(3000);
         Robot robot=new Robot();  //Robot class is present in java ,there is no method available in selenium to handle notificationpopup
         robot.keyPress(KeyEvent.VK_TAB);  //VK=Virtual key 
         robot.keyRelease(KeyEvent.VK_TAB);
         Thread.sleep(3000);
         robot.keyPress(KeyEvent.VK_ENTER);
         robot.keyRelease(KeyEvent.VK_ENTER);
	}
 //Actions class keyboard actions works only for webappln so we are using robotclass to work vk actions
	//robotclass vk action works for all the windows opened or browser opened
 
 
}
