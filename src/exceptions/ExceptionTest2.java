package exceptions;

public class ExceptionTest2 {
	public static void foo() {
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException oob) {
			throw new Exception(oob);
		}
	}

	public static void main(String[] args) {
		try {
			foo();
		} catch (Exception re) {
			System.out.println(re.getCause());
		}
	}

}
