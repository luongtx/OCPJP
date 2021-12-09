package concurency;

import java.util.stream.IntStream;

public class ParallelStreamTest {
	public static void main(String[] args) {
        int res = IntStream.rangeClosed(1, 1000).parallel()
                .filter( i -> i > 50).findFirst().getAsInt();
        System.out.println(res);
	}
}
