package concurency;



class UseCounterSync implements Runnable {
	public void increment() {
		synchronized (this) {
			CounterV2.count++;
			System.out.print(CounterV2.count + " ");
		}	
	}

	public void run() {
		increment();
		increment();
		increment();
	}
}

// This class creates three threads
public class SynchronizedExample {
	public static void main(String args[]) {
		UseCounterSync c = new UseCounterSync();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
	}
}
