package testng;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ConfigurationAnnotation;

public class Login extends ConfigurationAnnotation

{
   @Test(groups = "smoke")
   public void login() 
   {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://demowebshop.tricentis.com/login");
	   driver.findElement(By.id("Email")).sendKeys("sush231@gmail.com");
	   driver.findElement(By.id("Password")).sendKeys("456789");
	   driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	   driver.quit();
   }
   
}
