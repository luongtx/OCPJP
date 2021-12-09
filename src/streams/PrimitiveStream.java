package streams;
import java.util.stream.LongStream;

public class PrimitiveStream {
	public static void main(String[] args) {
		LongStream stream = LongStream.empty();
		System.out.println(stream.average());
	}
}
