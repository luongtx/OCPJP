package streams;

import java.util.ArrayList;
import java.util.List;

public class LazyTest {
	public static void main(String[] args) {
		List<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("abc"));
        list.add(new StringBuilder("xyz"));
        list.stream().map(x -> x.reverse());
//        list.stream().map(x -> x.reverse()).count();
        System.out.println(list);
	}
}
