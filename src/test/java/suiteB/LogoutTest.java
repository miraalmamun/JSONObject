package suiteB;

import org.testng.annotations.Test;

import dataProvider.TestDataProvider;

public class LogoutTest {
	
	@Test(dataProviderClass = TestDataProvider.class,dataProvider = "getData")
	public void logoutTest(String a,int b, String c, String d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	
	@Test(dataProviderClass = TestDataProvider.class,dataProvider = "getData")
	public void logoutTest2(String a,int b, String c, String d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	
	@Test(dataProviderClass = TestDataProvider.class,dataProvider = "getData")
	public void logoutTest3(String a,int b, String c, String d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}


}
