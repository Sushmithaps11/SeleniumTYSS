package com.selenium.driver;

public class MethodOverriding 
{
	
   public static void main(String[] args)
   {
	   Object obj = new Object();
	   obj="Hello";
	   System.out.println(obj.toString());
	   
	MethodOverriding ovr = new MethodOverriding ();
	//ovr.toString();
	System.out.println(ovr.toString());
	
	ovr.equals(obj);
	System.out.println(ovr.equals(obj));
   }
   
   public String toString()
   {
	   System.out.println("Overriden method");
	   return "PS";   
	}
   
   @Override
	public boolean equals(Object obj)
   {
		boolean flag = true;
		if(obj=="Hello") 
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		return true;
	}
}
