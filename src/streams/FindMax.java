package streams;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindMax {
	public static void main(String args[]) {
		maxMarks(IntStream.of(52, 60, 99, 80, 76));
	}

	public static void maxMarks(IntStream marks) {
		OptionalInt max = marks.max();
		if (max.ifPresent()) {
			System.out.print(max.getAsInt());
		}
	}

}
