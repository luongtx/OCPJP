package lambda.functional_interface;

import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

public class FunctionReturnUnaryTest {
	public static void main(String[] args) {
		DoubleFunction<DoubleUnaryOperator> func = m -> n -> m + n; // Line n1
		System.out.println(func.apply(11).applyAsDouble(24)); // Line n2

		Function<Integer, Function<Integer, Double>> fun = a -> (b -> 1.0 * a * b);
		System.out.println(fun.apply(10).apply(20));
	}
}
