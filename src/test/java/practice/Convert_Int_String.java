package practice;

import org.testng.annotations.Test;

public class Convert_Int_String {
	
	
	String roll = "1";
	
	int roll2 = Integer.parseInt(roll);
	
	
	
	String roll3 = Integer.toString(roll2);
	
	
	@Test
	public void compare()
	{
		System.out.println(roll.contentEquals("1"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
