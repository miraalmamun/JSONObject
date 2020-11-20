package mirException;

public class MyException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	public MyException(String msg)
	{
		System.out.println(msg);
	}

}
