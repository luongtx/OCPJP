package concurency.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorsFixedThreadPool {
	public static void main(String[] args) throws InterruptedException {
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
//		long start = System.currentTimeMillis();
		executor.submit(() -> {
			Thread.sleep(1000);
			return null;
		});
		executor.submit(() -> {
			Thread.sleep(1000);
			return null;
		});
		executor.submit(() -> {
			Thread.sleep(1000);
			return null;
		});
		executor.submit(() -> {
			Thread.sleep(1000);
			return null;
		});

		assert 2 == executor.getPoolSize();
		assert 2 == executor.getQueue().size();
//		executor.awaitTermination(1, TimeUnit.SECONDS);
		executor.shutdown();
	}
}
