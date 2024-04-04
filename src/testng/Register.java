package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ConfigurationAnnotation;

public class Register extends ConfigurationAnnotation
{
   @Test(groups = "Smoke")
   public void register() 
   {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://demowebshop.tricentis.com/");
	   driver.findElement(By.linkText("Register")).click();
	   driver.findElement(By.id("gender-female"));
	   driver.findElement(By.id("FirstName")).sendKeys("abc");
	   driver.findElement(By.id("LastName")).sendKeys("d");
	   driver.findElement(By.id("Email")).sendKeys("sush231@gmail.com");
	   driver.findElement(By.id("Password")).sendKeys("456789");
	   driver.findElement(By.id("ConfirmPassword")).sendKeys("456789");
	   driver.findElement(By.id("register-button")).click();
	   driver.quit();
	   
   }
}