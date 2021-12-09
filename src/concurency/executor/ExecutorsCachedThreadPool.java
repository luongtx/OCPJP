package concurency.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorsCachedThreadPool {
	public static void main(String[] args) {
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		executor.submit(() -> {
			System.out.println("Task1");
		});
		executor.submit(() -> {
			Thread.sleep(1000);
			System.out.println("Task2");
			return null;
		});
		executor.submit(() -> {
			Thread.sleep(1000);
			System.out.println("Task3");
			return null;
		});
		executor.submit(() -> {
			Thread.sleep(1000);
			System.out.println("Task4");
			return null;
		});

		assert executor.getPoolSize() == 3;
		assert executor.getQueue().size() == 0;
		executor.shutdown();
	}
}
