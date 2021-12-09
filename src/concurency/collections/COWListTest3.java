package concurency.collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWListTest3 {
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
//		List<String> list = new ArrayList<>();
		list.add("Melon");
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");

		/*
		 * On every modification, a fresh copy of underlying array is created, leaving
		 * the iterator object unchanged. 'Melon' is printed on to he console.
		 */
		for (String s : list) {
			list.removeIf(str -> str.startsWith("M"));
//			System.out.println(list);
			System.out.println(s);// s was copied, not retrieved from the list
		}
//		System.out.println(list);
	}
}
