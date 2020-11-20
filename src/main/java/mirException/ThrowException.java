package mirException;

public class ThrowException {

	public static void main(String[] args) {

		throwException();

	}

	
	
	
	
	public static void throwException() {

        // throw new MyException("Some thing wrong in your code");
		throw new ArithmeticException("Some things wrong in your codes");
	}

}
