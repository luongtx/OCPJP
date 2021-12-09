package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FindFirstTest {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("pen", "is", "not", "a", "pencil");
		Predicate<String> test = s -> {
			int i = 0;
			boolean result = s.contains("pen");
			System.out.println((i++) + ":");
			return result;
		};
		str.stream().filter(test).findFirst().ifPresent(System.out::print);
	}
}
