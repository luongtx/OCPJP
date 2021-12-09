package generics;

import java.util.ArrayList;
import java.util.List;

public class Test10 {
	public static void main(String[] args) {
		List<? super CharSequence> list3 = new ArrayList<>();
		list3.add("123");
		list3.add(new StringBuilder("123"));
	}
}
