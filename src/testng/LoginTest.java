package testng;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends Base_Test {
	@Test(dataProvider = "logindata")
	public void loginTest(String username, String password) {
		Reporter.log("Browser is launched and website is dispayed");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Reporter.log("Login Page is displayed");
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Reporter.log("User is successfully logged in");
	}

	@DataProvider(name = "logindata")
	public String[][] loginData() throws EncryptedDocumentException, IOException {
		/*
		 * String[][] data = new String[4][2]; data[0][0]="sush231@gmail.com";
		 * data[0][1]="456789"; data[1][0]="ulu@gmail.com"; data[1][1]="7979386736";
		 * data[2][0]="Yallu@gmail.com"; data[2][1]="56653427";
		 * data[3][0]="Sinch2gmail.com"; data[3][1]="977863265";
		 * 
		 */
		// return MultipleExcelRead.multipleRead();
		return GenericForMultipleRead.multipleRead("login"); // for generic method
	}

}
