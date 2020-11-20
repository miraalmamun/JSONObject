package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

	@Test
	public void myTest()
	{
		System.out.println("My Test");
		//Assert.assertEquals(false, true);
		
		Assert.fail("Hello");
	}
}
