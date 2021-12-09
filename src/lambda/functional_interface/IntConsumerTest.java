package lambda.functional_interface;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class IntConsumerTest {
	public static void main(String[] args) {
        IntConsumer consumer = i -> i * i * i;
        int result = IntStream.range(1, 5).sum();
        System.out.println(result);
	}
}
