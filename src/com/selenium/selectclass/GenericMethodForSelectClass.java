package com.selenium.selectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericMethodForSelectClass 
{
  public void Selectclass(WebElement dropDown,String option) 
  {
	Select select = new Select(dropDown);
     int counter=0;
	try
	{
		int indexvalue=Integer.parseInt(option);
		select.selectByIndex(indexvalue);
		counter++;
	}catch(Exception e)//NumberFormatException
	{
		e.printStackTrace();
		System.out.println("Not and index value");
	}
	if(counter==0)
	{
		try {
			select.selectByValue(option);
		}catch(Exception e)
		{
			select.selectByVisibleText(option);
		}
	}
}
	
}
