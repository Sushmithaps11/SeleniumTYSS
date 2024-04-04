package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation
{
	@BeforeSuite
	//used for connecting database or starting reports
  public void beforesuite()
  {
	  System.out.println("Before Suite");
  }
	
   @AfterSuite
 public void aftersuite()
 {
	   //used to stop connecting database or starting reports
	 System.out.println("After Suite");
 }
   @BeforeTest
   public void beforetest()
   {
	   //one suite might have multiple tests
	   //so any preconditins specific to test will 
 	  System.out.println("Before Test");
   }
   @AfterTest
   public void aftertest()
   {
 	  System.out.println("After Test");
   }
   @BeforeClass
   public void beforeclass()
   {
 	  System.out.println("Before Class");
   }
   @AfterClass
   
   //close browser
   public void afterclass()
   {
 	  System.out.println("After Class");
   }
   @BeforeMethod
   public void beforemethod()
   {
 	  System.out.println("Before Method");
   }
   @AfterMethod
   public void aftermethod()
   {
 	  System.out.println("After Method");
   }
   @Test
   
   public void testannotation()
   {
 	  System.out.println("Test Annotation");
   }

}
