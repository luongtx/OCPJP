package generics;

import java.util.ArrayList;
import java.util.List;

public class Test9 {
	public static void main(String[] args) {
		List<? super Object> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");

		List<? extends Object> list2 = list1;
		list2.remove("A"); // Line 13

		/*
		 * upper-bounded wildcard is used, hence add operation is not supported. Line 14
		 * causes compilation failure. *
		 */
		list2.add("C"); // Line 14
	}
}
