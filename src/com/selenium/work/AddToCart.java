package com.selenium.work;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart 
{
   public static void main(String[] args) throws InterruptedException
   {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.findElement(By.partialLinkText("Sign in")).click();
	driver.findElement(By.id("email")).sendKeys("ump@gmail.com");
	driver.findElement(By.id("passwd")).sendKeys("123456789");
	driver.findElement(By.xpath("//button[@name='SubmitLogin']")).submit();
	
	driver.findElement(By.xpath("//a[text()='Women']")).click();
	driver.findElement(By.xpath("//img[contains(@src,'http://www.automationpractice.pl/img/p/7')]")).click();
	//add to cart button designed under frame so  we  switch control to frame
	Thread.sleep(4000);
	driver.switchTo().frame((WebElement) By.xpath("//iframe[@class='fancybox-iframe']"));
    driver.findElement(By.xpath("//p[@id='add_to_cart']")).click();
	
	
}
}
