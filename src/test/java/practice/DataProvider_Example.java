package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Example {
	
	
	@Test(dataProvider = "data")
	public void login(String a, int b, String c,String d)
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] data1 = new Object[3][4];
		
		data1[0][0] = "Mir";
		data1[0][1] = 12;
		data1[0][2] = "H";
		data1[0][3] = "123";
		
		data1[1][0] = "Mira";
		data1[1][1] = 13;
		data1[1][2] = "I";
		data1[1][3] = "124";
		
		data1[2][0] = "Mirb";
		data1[2][1] = 14;
		data1[2][2] = "J";
		data1[2][3] = "125";
		
		return data1;
	}
	
	
	
	
	
	
	
	
	
	

}
