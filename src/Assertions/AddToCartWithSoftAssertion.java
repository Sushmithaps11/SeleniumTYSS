package Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class AddToCartWithSoftAssertion
{
	public void cart()
	{
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://demowebshop.tricentis.com/books");
		  driver.findElement(By.partialLinkText("BOOKS"));
		  driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input")).click();
		  driver.findElement(By.xpath("//a[text()='shoppingcart']")).click();
		  SoftAssert ast=new SoftAssert();
		  ast.assertEquals(driver.findElement(By.xpath("//table[@class='cart']//tr)[2]/td[3]/a")).getText(), "Comput and Internet");
		  ast.assertAll();
   }
}