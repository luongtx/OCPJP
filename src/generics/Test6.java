package generics;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
	public static void main(String[] args) {
		List<? super String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		for (String str : list) {
			System.out.print(str);
		}
	}
}
