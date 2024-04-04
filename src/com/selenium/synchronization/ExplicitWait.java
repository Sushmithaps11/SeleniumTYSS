package com.selenium.synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait
{
  public static void main(String[] args)
  {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/");
    
    driver.findElement(By.partialLinkText("Register")).click();
    //explicit wait
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.urlContains("register"));
    driver.findElement(By.id("gender-male")).click();
    
}
}
