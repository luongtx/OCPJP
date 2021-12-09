package streams;

import java.util.stream.Stream;

public class InfiniteStreamTest {
	public static void main(String[] args) {
		Stream<Double> stream = Stream.generate(() -> new Double("1.0")).limit(5);
		System.out.println(stream.count());
//        System.out.println(stream.sorted().findFirst());
	}
}
