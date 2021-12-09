package concurency.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest2 {
	public static void main(String[] args) {
		AtomicInteger integer = new AtomicInteger(0);
		integer.compareAndSet(0, 5);
		System.out.println(integer);
	}
}
