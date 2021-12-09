package collections.lists;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("T", "S", "R", "I", "F");
		ListIterator<String> iter = list.listIterator(5);
		while (iter.hasPrevious()) {
			System.out.print(iter.previous());
		}
	}
}
