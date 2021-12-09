package generics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.util.stream.IntStream;

class Bird {}
class Sparrow extends Bird {}

public class CollectionWildCard {
	public static void main(String[] args) {
		List<? extends Bird> list = new ArrayList<Bird>();
		list.add(new Sparrow());
		// list.forEach(System.out::println);
		for(Object obj: list) {
			System.out.println(obj);
		}
	}
}