package utils;

//import org.testng.ITestListener;
import org.testng.ITestNGListener;
//import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class MyTestNGListener implements ITestNGListener {
	
	
	public void onTestStart(ITestResult result)
	{   
		System.out.println(result.getTestName()+" started");
		System.out.println("===============================");
	
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println(result.getTestName()+" failed");
		System.out.println(".............................");
	}

}
