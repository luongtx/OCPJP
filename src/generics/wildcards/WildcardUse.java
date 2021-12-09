package generics.wildcards;

import java.util.List;
import java.util.ArrayList;

public class WildcardUse {
	static void printList(List<?> list) {
		for (Object element : list)
			System.out.println("[" + element + "]");
	}

	static <T> void printList2(List<T> list) {
		for (T element : list)
			System.out.println("[" + element + "]");
	}

	static <T> void printList3(List<?> list) {
		for (Object element : list)
			System.out.println("[" + element + "]");
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(100);
		printList3(list);
		List<String> strList = new ArrayList<>();
		strList.add("10");
		strList.add("100");
		printList3(strList);
	}
}