package lambda.functional_interface;

import java.util.function.Function;

public class FunctionTest2 {
	public static void main(String[] args) {
		Function<char [], String> obj2 = (char[] arr) -> new String(arr);
	}
}
