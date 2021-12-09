package concurency.parallel_stream;

import java.util.Arrays;

public class ReduceTest2 {
	public static void main(String[] args) {
		String s1 = Arrays.asList("A", "E", "I", "O", "U").stream().reduce("_", String::concat);
		String s2 = Arrays.asList("A", "E", "I", "O", "U").parallelStream().reduce("_", String::concat);
		System.out.println(s1);
		System.out.println(s2);
//		System.out.println(s1.equals(s2));
	}
}
