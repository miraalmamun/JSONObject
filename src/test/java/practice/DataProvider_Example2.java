package practice;

import org.testng.annotations.Test;

import dataProvider.TestDataProvider;

public class DataProvider_Example2 {
	
	

	@Test(dataProviderClass = TestDataProvider.class,dataProvider = "getData")
	public void login(String a, int b, String c,String d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	
	@Test(dataProviderClass = TestDataProvider.class,dataProvider = "getData")
	public void logout(String a, int b, String c,String d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	
	
	
	
	
	

}
