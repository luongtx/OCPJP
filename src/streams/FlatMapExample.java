package streams;

import java.util.Arrays;

public class FlatMapExample {
	public static void main(String[] args) {
		String[] string = "you never know what you have until you clean your room".split(" ");
		Arrays.stream(string).flatMap(word -> Arrays.stream(word.split(""))).distinct().forEach(System.out::print);

	}
}
