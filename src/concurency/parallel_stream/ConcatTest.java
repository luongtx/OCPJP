package concurency.parallel_stream;

import java.util.stream.Stream;

public class ConcatTest {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("J", "A", "V", "A");
		String text = stream.parallel().reduce(String::concat).get();
//		String text = stream.parallel().reduce("", String::concat);
//		String text = stream.parallel().reduce("a", String::concat);
//		String text = stream.reduce("a", String::concat);
		System.out.println(text);
	}
}
