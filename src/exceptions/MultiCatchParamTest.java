package exceptions;

class MyException extends RuntimeException {
	public MyException() {
		// TODO Auto-generated constructor stub
		super("My exception");
	}
}

class YourException extends RuntimeException {
	public YourException() {
		// TODO Auto-generated constructor stub
		super("Your exception");
	}
}

//If a catch block handles more than one exception type, then the catch parameter is implicitly final
public class MultiCatchParamTest implements Cloneable {
	public static void main(String[] args) {
		try {
			throw new YourException();
		} catch (MyException | YourException e) {
			System.out.println(e);
//			e = null;
		}
	}
}
