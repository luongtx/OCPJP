package collections.concrete_class;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest4 {
	public static void main(String[] args) {
		Deque<Character> chars = new ArrayDeque<>();
		chars.add('A');
		chars.remove();
		chars.remove();

		System.out.println(chars);
	}
}
