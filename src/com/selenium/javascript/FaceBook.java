package com.selenium.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook 
{
  public static void main(String[] args) throws InterruptedException
  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("");
	
	WebElement custom = driver.findElement(By.xpath(""));
	WebElement gender = driver.findElement(By.xpath(""));
	
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='god';", gender);
	custom.click();
}
}
