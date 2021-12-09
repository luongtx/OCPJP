package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class IntStreamAverageTest {
	public static void main(String[] args) {
		Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5).stream();
//		System.out.println(stream.mapToInt(i -> i).average().getAsInt());
		System.out.println(stream.mapToInt(i -> i).average().getAsDouble());
	}
}
