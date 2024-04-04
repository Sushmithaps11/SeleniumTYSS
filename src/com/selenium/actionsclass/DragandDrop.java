package com.selenium.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//drag and drop or clickandhold release methods
public class DragandDrop
{
   public static void main(String[] args)
   {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
	Actions action=new Actions(driver);
	WebElement washingtonCapital = driver.findElement(By.xpath("//div[@id='box3']"));
	WebElement unitedstates=driver.findElement(By.xpath("//div[@id='box103']"));
	action.dragAndDrop(washingtonCapital, unitedstates).perform();
	
	WebElement madridCapital = driver.findElement(By.xpath("//div[@id='box7']"));
	WebElement spain = driver.findElement(By.xpath("//div[@id='box107']"));
	action.clickAndHold(madridCapital).release(spain).perform();
	

}
}
