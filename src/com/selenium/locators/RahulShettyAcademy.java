package com.selenium.locators;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyAcademy
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> pricecolum = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/td[3]"));
		ArrayList<String> price = new ArrayList<String>();
		for(int i=0;i<price.size();i++)
		{
			price.add(i,pricecolum.get(i).getText());
			
		}
	}
	
	
}
