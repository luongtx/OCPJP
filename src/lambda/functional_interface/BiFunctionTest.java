package lambda.functional_interface;

import java.util.function.BiFunction;

public class BiFunctionTest {
	public static void main(String[] args) {
//		BiFunction<String, String, String> concatStr = (x, y) -> x + y;
//		System.out.println(concatStr.apply("hello ", "world"));
		
		BiFunction<Double, Double, Integer> compareDoubles = Double::compare;
		System.out.println(compareDoubles.apply(10.0, 10.0));
	}
}
