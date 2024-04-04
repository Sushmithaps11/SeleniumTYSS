package com.selenium.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEClick 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.oracle.com/in/java/technologies/downloads/");
	driver.findElement(By.xpath("//a[text()='jdk-8u401-linux-aarch64.rpm']")).click();
	WebElement disabledLink=driver.findElement(By.xpath("//a[text()='Download jdk-8u401-linux-aarch64.tar.gz']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", disabledLink);
}
}
