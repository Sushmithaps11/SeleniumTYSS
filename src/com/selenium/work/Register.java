package com.selenium.work;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register

{
public static void main(String[] args)
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
	WebElement signinTextField = driver.findElement(By.xpath("//a[contains(text(),\"Sign in\")]"));
	signinTextField.click();
	
	WebElement emailadressTextField = driver.findElement(By.xpath("//input[@name='email_create']"));
	emailadressTextField.sendKeys("ump@gmail.com");
	
	driver.findElement(By.id("SubmitCreate")).submit();
	
	driver.findElement(By.id("id_gender2"));
	driver.findElement(By.name("customer_firstname")).sendKeys("Sushmitha");
	driver.findElement(By.name("customer_lastname")).sendKeys("PS");
	driver.findElement(By.name("email"));
	driver.findElement(By.name("passwd")).sendKeys("123456789");
	
	WebElement daysDropdown = driver.findElement(By.name("days"));
	Select select = new Select(daysDropdown);
	select.selectByValue("11");
	
	WebElement monthsDropdown = driver.findElement(By.name("months"));
	Select s = new Select(monthsDropdown);
	s.selectByValue("10");
	
	WebElement yearsDropdown = driver.findElement(By.name("years"));
	Select sc=new Select(yearsDropdown);
	sc.selectByValue("2000");
	
	driver.findElement(By.id("uniform-newsletter"));
	driver.findElement(By.xpath("//button[@name='submitAccount']")).submit();
	
}
}

