package collections.concrete_class;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class DequeTest3 {
	public static void main(String[] args) {
		/*
		 * ArrayDeque cannot store null, hence Line n2 throws NullPointerException
		 * exception.
		 * 
		 * ArrayDeque doesn't store null because its poll() method returns null in case
		 * ArrayDeque is empty. If null element was allowed, then it would be not
		 * possible to find out whether poll() method is returning null element or
		 * ArrayDeque is empty.
		 */
		List<String> list = Arrays.asList("oca", null, "ocp", "java", "null"); // Line n1
		Deque<String> deque = new ArrayDeque<String>(list); // Line n2
		System.out.println(deque.size()); // Line n3
	}
}
