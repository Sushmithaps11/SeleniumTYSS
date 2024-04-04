package com.selenium.takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import frameworkcomponents.FrameworkLibrary;

public class TakeScreenshot//whole page
{
   public static void main(String[] args) throws IOException
   {
	  // LocalDateTime dateTime=LocalDateTime.now();
	  // String fileName=dateTime.toString().replace(":", "-");
	   
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://www.zomato.com/");
	driver.get("https://www.selenium.dev/");
	
	/*TakesScreenshot ts = (TakesScreenshot)driver;
	File destination=new File("./Screenshots/zomatoapplication.png");
	File temp=ts.getScreenshotAs(OutputType.FILE);
    FileHandler.copy(temp,destination);
*/
	
	FrameworkLibrary lib=new FrameworkLibrary();
	lib.takeScreenshotofPage(driver);
	WebElement seleniumIDEImage = driver.findElement(By.id("selenium_ide"));
	lib.takeScreenshotofElement(seleniumIDEImage);
	
   }  
}
