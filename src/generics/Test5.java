package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test5 {
	public static void main(String[] args) {
		List<? extends String> list = new ArrayList<>(Arrays.asList("A", "E", "I", "O")); // Line 8
		//Line 8 is a valid syntax but as upper-bounded wildcard is used, hence add operation is not supported. Line 9 causes compilation failure.
		list.add("U"); // Line 9
		list.forEach(System.out::print);
	}
}
