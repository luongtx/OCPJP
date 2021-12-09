package concurency.parallel_stream;

import java.util.stream.Stream;

public class ReduceTest4 {
	// Accumulator: accumulate elements in a single substream
	// Combiner: combine results of substreams into a single one
	public static void main(String[] args) {
//		String str1 = Stream.iterate(1, i -> i + 1).limit(10).reduce("", (i, s) -> i + s, (s1, s2) -> s1 + s2);
//		String str2 = Stream.iterate(1, i -> i + 1).limit(10).parallel().reduce("", (i, s) -> i + s,
//				(s1, s2) -> s1 + s2);
//		System.out.println(str1.equals(str2));

		int a = Stream.iterate(1, i -> i + 1).limit(1000).reduce(0, (i, s) -> i + s);
		int b = Stream.iterate(1, i -> i + 1).limit(1000).parallel().reduce(0, (i, s) -> i + s);
		System.out.println(a + " " + b);
	}
}
