package streams;
import java.util.stream.Stream;

public class StreamGenerate {
	public static void main(String[] args) {
		Stream<Double> stream = Stream.generate(() -> new Double("1.0"));
		System.out.println(stream.sorted().findFirst());
//		System.out.println(stream.findFirst());
	}
}
