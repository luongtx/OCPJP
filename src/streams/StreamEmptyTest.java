package streams;

import java.util.stream.Stream;

public class StreamEmptyTest {
	public static void main(String[] args) {
		Stream.of().map(s -> s.reverse()).forEach(System.out::println);
//		Stream.of().map(s -> s.hashCode()).forEach(System.out::println);
		Stream.of(new StringBuilder(1)).map(s -> s.reverse()).forEach(System.out::println);
	}
}
