package concurency.atomic;

import java.util.concurrent.atomic.AtomicInteger;

class SynchronizedCounter {
	private int c = 0;

	public synchronized void increment() {
		c++;
	}

	public synchronized void decrement() {
		c--;
	}

	public synchronized int value() {
		return c;
	}

}

/*
 * For a more complicated class, we might want to avoid the liveness impact of
 * unnecessary synchronization. Replacing the int field with an AtomicInteger
 * allows us to prevent thread interference without resorting to synchronization
 */
class AtomicCounter {
	private AtomicInteger c = new AtomicInteger(0);

	public void increment() {
		c.incrementAndGet();
	}

	public void decrement() {
		c.decrementAndGet();
	}

	public int value() {
		return c.get();
	}

}
