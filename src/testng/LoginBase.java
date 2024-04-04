package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginBase extends Base_Test
{
	@Test
public void login() 
{
	   driver.findElement(By.xpath("//a[text()='Log in']")).click();
	   driver.findElement(By.id("Email")).sendKeys("sush231@gmail.com");
	   driver.findElement(By.id("Password")).sendKeys("456789");
	   driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	  
}



}
