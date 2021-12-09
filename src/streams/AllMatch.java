package streams;

import java.util.stream.Stream;

public class AllMatch {
	public static void main(String[] args) {
		boolean result = Stream.of("do", "re", "mi", "fa", "so", "la", "ti").filter(str -> str.length() > 5)
				.peek(System.out::println).allMatch(str -> str.length() > 5);
		System.out.println(result);
		// boolean resut = Stream.of().allMatch(s -> s.toString().length() > 0);
		// System.out.println(resut);
	}
}
