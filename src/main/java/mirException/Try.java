package mirException;

public class Try {

	public static void main(String[] args) {
		
		
		math();

	}

	
	public static void math()
	{     
		int c = 0;
		
		try {
			
			 c = 10/0;
			 System.out.println("=======");
			
			
		} catch (ArithmeticException e) {
			
			
			c = 10/2;
			
			System.out.println("Don't divided by zero");
		}
		
		System.out.println(c);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
