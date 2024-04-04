package com.selenium.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsAssign 
{
 public static void main(String[] args) 
 {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
    driver.findElement(By.id("show-textbox")).click();
   WebElement TF= driver.findElement(By.xpath("//input[@id='displayed-text']"));
   JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='Sushmitha';",TF );
    
    driver.findElement(By.xpath("//input[@value='Hide']")).click();
	
	
}
}
