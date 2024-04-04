package com.selenium.popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp
{
	//to avoid Fileuploadpopup
// if file is in input tag and type is file we can avoid it by sendkeys
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://smallpdf.com/pdf-to-word");
		
		WebElement fileUpload = driver.findElement(By.xpath("//input[@type='file']"));
		fileUpload.sendKeys("C:\\Users\\User\\Downloads\\LEAVE POLICY - 2024");
	}
	
	
}

