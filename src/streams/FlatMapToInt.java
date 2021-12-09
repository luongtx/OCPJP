package streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapToInt {
	public static void main(String[] args) {
		Stream<List<String>> iStr = Stream.of(Arrays.asList("1", "John"), Arrays.asList("2", null));
//		Stream<String> nInSt = iStr.flatMap((x) -> x.stream());
//		Stream<Integer> nInSt = iStr.flatMap((x) -> x.stream().map(s -> s.length()));
		IntStream nInSt = iStr.flatMapToInt((x) -> x.stream().mapToInt(s -> s.length()));
		nInSt.forEach(System.out::print);
	}
}