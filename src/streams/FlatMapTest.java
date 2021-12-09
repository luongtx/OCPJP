package streams;

import java.util.stream.Stream;

public class FlatMapTest {
	public static void main(String[] args) {
        Stream<String> stream = Stream.of("ocp");
        //s.chars() return IntStream of charcode
        stream.flatMap(s -> s.chars()).forEach(i -> System.out.print((char)i));
        stream.flatMapToInt(s -> s.chars()).forEach(i -> System.out.print((char)i));
	}
}
