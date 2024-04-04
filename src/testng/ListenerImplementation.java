package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener
{
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
    {
    	System.out.println("Test failed");
    }
    
    @Override
    public void onStart(ITestContext context)
    {
    	System.out.println("Test start");
    	
    }
    
    @Override
    public void onFinish(ITestContext context) 
    {
    	System.out.println("Test finish");
    }
    
    @Override
    public void onTestSkipped(ITestResult result) 
    {
    	System.out.println("Test skipped");
    }
}
