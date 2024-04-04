package com.selenium.popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.name("cusid")).sendKeys("12445");
	driver.findElement(By.name("submit")).click();
	
	/*Alert interface have 4 Abstract Methods
	 Accept()
	 dismiss()
	 gettext()
	 sendkeys()----Stringtype(all other sendkeys charseq)
	*/
	Alert alert =driver.switchTo().alert();                         
	Thread.sleep(3000);                                             
	alert.accept();                                                 
	alert.accept(); // for the second alert popup                   
  }                                                                   
}
