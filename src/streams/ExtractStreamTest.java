package streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExtractStreamTest {
	public static void main(String[] args) {
		IntStream.of(1, 2, 3, 4, 5).map(i -> i * i)
				.peek(i -> System.out.println(i)).peek(System.out::println).sum();
		// DoubleStream.of(1.0,
		// 4.0,9.0).map(Math::sqrt).peek(System.out::println).sum();
	}
}
