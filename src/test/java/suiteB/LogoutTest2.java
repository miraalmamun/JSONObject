package suiteB;

import org.testng.annotations.Test;

import dataProvider.TestDataProvider;

public class LogoutTest2 {
	
	

	@Test(dataProviderClass = TestDataProvider.class,dataProvider = "getData")
	public void logoutTest4(String a,int b, String c, String d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	
	@Test(dataProviderClass = TestDataProvider.class,dataProvider = "getData")
	public void logoutTest5(String a,int b, String c, String d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	
	@Test(dataProviderClass = TestDataProvider.class,dataProvider = "getData")
	public void logoutTest6(String a,int b, String c, String d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}


}
