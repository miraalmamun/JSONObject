package practice;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ITestContext_Test {
	
	@Test(priority = 1)
	public void test1(ITestContext context)
	{
		
		String phoneVersion = "5";
		
		context.setAttribute("Version", phoneVersion);
		
		
			
	}
	
	@Test(priority = 2)
	public void test2(ITestContext context)
	{
		String phoneVersion = (String) context.getAttribute("Version");
		//int version = phoneVersion;
		System.out.println(phoneVersion);
	}
	
	@Test(priority = 3)
	public void test3(ITestContext context)
	{
			
	}
	
	
	
}
