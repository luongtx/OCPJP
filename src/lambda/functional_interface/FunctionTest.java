package lambda.functional_interface;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		Function<Integer, Integer> negate = (i -> -i), square = (i -> i * i), 
		negateSquare = negate.compose(square); // Call square before negate
		System.out.println(negateSquare.apply(10));
	}
}
