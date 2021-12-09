package streams;

import java.util.function.LongFunction;
import java.util.function.LongUnaryOperator;
import java.util.stream.Stream;

public class UnknownTest {
	public static void main(String[] args) {
		long seed = 10;
		Stream<Long> stream = Stream.iterate(seed, i -> i + 2).limit(2); // Line n1
		LongFunction<LongUnaryOperator> func = m -> (n -> n / m); // Line n2
		stream.mapToLong(i -> i).map(func.apply(2)).forEach(System.out::println); // Line n3
	}
}
/*
 * LongFunction<LongUnaryOperator> func = (m) -> { return (n) -> { return n / m;
 * }; };
 */

/*
 * LongUnaryOperator operator = new LongUnaryOperator() { return (n) -> { return
 * n/2; }; };
 */