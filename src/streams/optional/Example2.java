package streams.optional;

import java.util.Optional;

public class Example2 {
	public static void main(String[] args) {
		Optional<String> empty = Optional.empty();
		System.out.println(empty);

		// Optional<String> nullStr = Optional.of(null);
		// System.out.println(nullStr);

		Optional<String> nullableStr = Optional.ofNullable(null);
		System.out.println(nullableStr);
		System.out.println(nullableStr.get());
		nullableStr.ifPresent(System.out::println);
	}
}
