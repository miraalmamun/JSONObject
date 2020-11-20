package suiteB;

import org.testng.annotations.Test;

import dataProvider.TestDataProvider;

public class LogoutTest3 {
	
	@Test(dataProviderClass = TestDataProvider.class,dataProvider = "getData")
	public void logoutTest7(String a,int b, String c, String d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	
	@Test(dataProviderClass = TestDataProvider.class,dataProvider = "getData")
	public void logoutTest8(String a,int b, String c, String d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	
	@Test(dataProviderClass = TestDataProvider.class,dataProvider = "getData")
	public void logoutTest9(String a,int b, String c, String d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}


}
