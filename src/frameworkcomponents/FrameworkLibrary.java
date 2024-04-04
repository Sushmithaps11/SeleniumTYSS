package frameworkcomponents;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class FrameworkLibrary
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
	
	
	
	public void takeScreenshotofPage(WebDriver driver)
	{
		 LocalDateTime dateTime=LocalDateTime.now();
		 String fileName = dateTime.toString().replace(":", "-");
		 
           TakesScreenshot ts = (TakesScreenshot)driver;
			File destination=new File("./Screenshots/"+fileName+".png");
			File temp=ts.getScreenshotAs(OutputType.FILE);
		    try {
				FileHandler.copy(temp,destination);
			} catch (IOException e) {
		
				e.printStackTrace();
			}

	}
	
	public void takeScreenshotofElement(WebElement element)
	{
		File destination=new File("./Screenshots/"+name()+".png");
		File temp=element.getScreenshotAs(OutputType.FILE);
	    try {
			FileHandler.copy(temp,destination);
		} catch (IOException e) {
	
			e.printStackTrace();
		}
	}
	
	
	public String name()
	{
		LocalDateTime dateTime=LocalDateTime.now();
		 String fileName = dateTime.toString().replace(":", "-");
		 return fileName;
	}
	
}
