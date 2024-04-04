package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(testng.ListenerImplementation.class)
public class AddToCart
{
	public void cart() {
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.get("https://demowebshop.tricentis.com/");
  driver.findElement(By.id("Email")).sendKeys("sush231@gmail.com");
  driver.findElement(By.id("Password")).sendKeys("456789");

  driver.findElement(By.partialLinkText("BOOKS"));
  driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input")).click();
  //driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input")).click();
  driver.findElement(By.xpath("//a[text()='shoppingcart']")).click();
	}
}
