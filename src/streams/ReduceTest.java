package streams;

import java.util.stream.IntStream;

public class ReduceTest {
	public static void main(String[] args) {
		int res = 1;
		IntStream stream = IntStream.rangeClosed(1, 0);
//        System.out.println(stream.reduce(res, (i,j)-> i+j));

//        System.out.println(stream.reduce(res++, (i, j) -> i * j));
		System.out.println(stream.reduce((i, j) -> i * j));
	}
}
