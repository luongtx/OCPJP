package lambda.functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerTest {
	public static void main(String[] args) {
		BiConsumer<List<Integer>, ? super Integer> listAddElement = List::add;
		List aList = new ArrayList();
		listAddElement.accept(aList, 10);
		System.out.println(aList);
	}
}
