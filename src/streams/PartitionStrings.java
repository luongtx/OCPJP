package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitionStrings {
	public static void main(String[] args) {
		String[] words = "tran xuan luong".split(" ");
		Stream<String> wordStreams = Stream.of(words).distinct();
		Map<Boolean, List<String>> wordBlocks = wordStreams.collect(Collectors.partitioningBy(str -> str.length() > 4));
		System.out.println("Short words (len <= 4): " + wordBlocks.get(false));
		System.out.println("Long words (len > 4): " + wordBlocks.get(true));

		// String input = "tran xuan luong";
		// String inputs[] = Pattern.compile(" ").split(input);
		// System.out.println(Arrays.toString(inputs));
	}
}
