package concurency.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Test {
	public static void main(String[] args) throws InterruptedException {
//		CountDownLatch lock = new CountDownLatch(4);

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
		ScheduledFuture<?> future = executor.scheduleAtFixedRate(() -> {
			System.out.println("Hello World");
//			lock.countDown();
		}, 500, 100, TimeUnit.MILLISECONDS);

//		lock.await(1000, TimeUnit.MILLISECONDS);
//		future.cancel(true);
		executor.awaitTermination(650, TimeUnit.MILLISECONDS);
		executor.shutdown();
	}
}
