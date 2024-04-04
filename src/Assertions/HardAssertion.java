package Assertions;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class HardAssertion 
{
	public void cart() {
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://demowebshop.tricentis.com/login");
		  driver.findElement(By.id("Email")).sendKeys("sush231@gmail.com");
		  driver.findElement(By.id("Password")).sendKeys("456789");
		   driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		   
		 /* try
		  {
			Assert.assertTrue(driver.findElement(By.linkText("Log out"))).isDisplayed()
		  }
		  catch(Exception e){
			  assertTrue(false);
		  }*/
		  driver.findElement(By.partialLinkText("BOOKS")).click();
		  driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input")).click();
		  driver.findElement(By.xpath("//a[text()='shoppingcart']")).click();
		  
		  String actualresult= driver.findElement(By.xpath("//a[@class=\"product-name\"]")).getText();
		  Assert.assertTrue(actualresult.equals("story"));// intentiony checked for story to get assertion
		  
}
}