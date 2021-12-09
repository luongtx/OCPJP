package streams;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamIntsTest {
	public static void main(String[] args) {
        IntStream stream = new Random().ints(1, 7).limit(2);
        System.out.println(stream.max().getAsInt());
	}
}
