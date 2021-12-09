package streams.optional;

import java.util.Optional;

public class OptionalStream {
	public static void main(String[] args) {
		// Optional<String> string = Optional.of(" abracadabra ");
		// string.map(String::trim).ifPresent(System.out::println);

		Optional<String> string = Optional.ofNullable(null);
		// System.out.println(string.map(String::length).orElse(-1));
		// System.out.println(string.map(String::length).orElse(null));
		// System.out.println(string.map(String::length).orElseThrow(() -> new IllegalArgumentException()));
		// System.out.println(string.map(String::length).orElseThrow(IllegalArgumentException::new));
		System.out.println(string.map(String::length).orElseThrow(null));
	}
}
