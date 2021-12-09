package concurency.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWListTest {
	public static void main(String[] args) {
		ArrayList<Integer> aList = new CopyOnWriteArrayList<Integer>(); // LINE A
		aList.addAll(Arrays.asList(10, 20, 30, 40));
		System.out.println(aList);
	}
}
