package streams.optional;

import java.util.OptionalInt;

class MyException extends Exception {
}

public class OrElseThrow {
	public static void main(String[] args) {
		OptionalInt optional = OptionalInt.empty();
		System.out.println(optional.orElseThrow(MyException::new));
	}
}
