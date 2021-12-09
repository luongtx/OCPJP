package collections.concrete_class;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List list = new ArrayList<String>();
		list.add(1);
		list.add("2");
		list.remove("2");
		list.forEach(System.out::print);
	}
}
