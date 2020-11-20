package suiteA;

import org.testng.annotations.Test;

import dataProvider.TestDataProvider;

public class LoginTest3 {
	
	@Test(dataProviderClass = TestDataProvider.class,dataProvider = "getData")
	public void loginTest7(String a,int b, String c, String d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	
	@Test(dataProviderClass = TestDataProvider.class,dataProvider = "getData")
	public void loginTest8(String a,int b, String c, String d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	
	@Test(dataProviderClass = TestDataProvider.class,dataProvider = "getData")
	public void loginTest9(String a,int b, String c, String d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}


}
