package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByLengthThenNature {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("follow your heart but take your brain with you".split(" "));
		Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();
		words.stream().sorted(lengthCompare.thenComparing(String::compareTo)).distinct().forEach(System.out::println);
	}
}
