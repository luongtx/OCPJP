package concurency.atomic;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
	public static Integer integer = new Integer(0);
	public static AtomicInteger atomicInteger = new AtomicInteger(0);
	public static volatile int volatileInt = 0;
}

public class AtomicVariableTest {
	static class Incrementer extends Thread {
		public void run() {
			Counter.integer++;
			Counter.atomicInteger.incrementAndGet();
			Counter.volatileInt++;
		}
	}

	static class Decrementer extends Thread {
		public void run() {
			Counter.integer--;
			Counter.atomicInteger.decrementAndGet();
			Counter.volatileInt--;
		}
	}

	public static final int MAX_THREAD = 1000;
	public static void main(String[] args) throws InterruptedException {
		Thread incremeterThread[] = new Incrementer[MAX_THREAD];
		Thread decrementerThread[] = new Decrementer[MAX_THREAD];
		for (int i = 0; i < MAX_THREAD; i++) {
			incremeterThread[i] = new Incrementer();
			decrementerThread[i] = new Decrementer();
			incremeterThread[i].start();
			decrementerThread[i].start();
		}
		for (int i = 0; i < MAX_THREAD; i++) {
			incremeterThread[i].join();
			decrementerThread[i].join();
		}
		System.out.printf("Integer value = %d AtomicInteger value = %d Primitive value = %d", Counter.integer, Counter.atomicInteger.get(), Counter.volatileInt);
	}
}
