package concurency.atomic;

import java.util.concurrent.atomic.AtomicInteger;

class Counter2 implements Runnable {
	private static AtomicInteger ai = new AtomicInteger(3);
	
	public void run() {
		System.out.println(ai.getAndDecrement());
		System.out.println(Thread.currentThread().getName());
	}
}

public class CounterTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Counter2(), "thread1");
		Thread t2 = new Thread(new Counter2(), "thread2");
		Thread t3 = new Thread(new Counter2(), "thread3");
		Thread[] threads = { t1, t2, t3 };
		for (Thread thread : threads) {
			thread.start();
		}
	}
}