package com.selenium.selectclass;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
    public static void main(String[] args)
    {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/books");
		
	WebElement  sortByDropdown = driver.findElement(By.id("products-orderby"));
	//Select select=new Select(sortByDropdown);
      
	/*Select select=new Select(sortByDropdown);
	List<WebElement> options  = select.getOptions();
	for(int i=0;i<options.size();i++)
	{
		WebElement sortbyDropDown1 = driver.findElement(By.id("products-orderby"));
		Select select1=new Select(sortbyDropDown1);
		select1.selectByIndex(i);
	*/	
	GenericMethodForSelectClass generic=new GenericMethodForSelectClass();
	generic.Selectclass(sortByDropdown,"2" );
	}
	}

