package suiteA;

import org.testng.annotations.Test;

import dataProvider.TestDataProvider;

public class LoginTest2 {
	
	@Test(dataProviderClass = TestDataProvider.class,dataProvider = "getData")
	public void loginTest4(String a,int b, String c, String d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	
	@Test(dataProviderClass = TestDataProvider.class,dataProvider = "getData")
	public void loginTest5(String a,int b, String c, String d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	
	@Test(dataProviderClass = TestDataProvider.class,dataProvider = "getData")
	public void loginTest6(String a,int b, String c, String d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}


}
