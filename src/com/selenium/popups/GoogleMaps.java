package com.selenium.popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMaps
{
  public static void main(String[] args)
  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/maps");
	
	driver.findElement(By.id("hArJGc")).click();
	driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Davanagere");
	driver.findElement(By.xpath("//input[@placeholder='Choose destination...']")).sendKeys("Bengaluru"+Keys.ENTER);
	
	
  }
}
