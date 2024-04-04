package com.selenium.work;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
    public static void main(String[] args)
    {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.automationpractice.pl/index.php");
		driver.findElement(By.xpath("//a[contains(text(),\\\"Sign in\\\")]")).click();
		driver.findElement(By.name("email")).sendKeys("ump@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@name='SubmitLogin']")).submit();
		
	}
}
