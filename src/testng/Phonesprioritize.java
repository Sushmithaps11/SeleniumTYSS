package testng;

import org.testng.annotations.Test;
//if we dont give the priority it will execute in alphabetical order
//if we skip giving priority for anyone or two method ---first it will execute based on alphabetical order
//if we give negative priority thn it will execute first
public class Phonesprioritize 
{
	@Test(priority = 3)
  public void samsung()
  {
	  System.out.println("samsung phones");
  }
	@Test(priority = 4)
	  public void apple()
	  {
		  System.out.println("apple phones");
	  }
	@Test(priority = 2)
	  public void oneplus()
	  {
		  System.out.println("oneplus phones");
	  }
	@Test
	  public void vivo()
	  {
		  System.out.println("vivo phones");
	  }
	@Test(priority = 1)
	  public void realme()
	  {
		  System.out.println("realme phones");
	  }
}
