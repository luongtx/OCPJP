package concurency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManagerSynchronized {
	private int sheepCount = 0;

	private synchronized void incrementAndReport() {
		System.out.print((++sheepCount) + " ");
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			SheepManagerSynchronized manager = new SheepManagerSynchronized();
			for (int i = 0; i < 10; i++)
				service.submit(() -> manager.incrementAndReport());
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}
