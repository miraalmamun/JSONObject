package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {
	
	@Test
	public void myTest2()
	{
		System.out.println("My Test2");
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void myTest3()
	{
		System.out.println("My Test3");
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void myTest4()
	{
		System.out.println("My Test4");
		Assert.assertEquals(true, true);
	}

}
