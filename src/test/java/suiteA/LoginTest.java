package suiteA;

import org.testng.Assert;
import org.testng.annotations.Test;

import dataProvider.TestDataProvider;

public class LoginTest {
	
	@Test(dataProviderClass = TestDataProvider.class,dataProvider = "getData")
	public void loginTest(String a,int b, String c, String d)
	{     //loginTest
		System.out.println(a+" "+b+" "+c+" "+d);
		Assert.fail("Force to fail");
	}
	
	@Test(dataProviderClass = TestDataProvider.class,dataProvider = "getData")
	public void loginTest2(String a,int b, String c, String d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	
	@Test(dataProviderClass = TestDataProvider.class,dataProvider = "getData")
	public void loginTest3(String a,int b, String c, String d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}

}
