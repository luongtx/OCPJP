package generics.subtypes;

import java.util.ArrayList;
import java.util.List;

public class SubtypeTest1 {
	public static void main(String[] args) {
		List<Number> intList = new ArrayList<Integer>();
		intList.add(new Integer(10)); // okay
		intList.add(new Float(10.0f)); // oops!

	}
}
