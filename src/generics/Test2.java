package generics;

import java.util.List;

class Test2<? super String> {
	public static void addNumbers(List<? super Integer> list) {
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
	}
}