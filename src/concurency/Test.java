package concurency;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
	public static void addAndPrintItems(BlockingDeque<Integer> deque) throws InterruptedException {
		deque.offer(103);
		deque.offerFirst(20, 1, TimeUnit.SECONDS);
		deque.offerLast(85, 7, TimeUnit.HOURS);
		System.out.print(deque.pollFirst(200, TimeUnit.NANOSECONDS));
		System.out.print(" " + deque.pollLast(1, TimeUnit.MINUTES));

	}

	class Printer implements Callable<String> {
		public String call() {
			System.out.println("DONE");
			return null;
		}
	}

	public static void main(String[] args) {
//		addAndPrintItems(new LinkedBlockingDeque<>());
//		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
//		Runnable task1 = () -> System.out.println("Hello Zoo");
//		Callable<String> task2 = () -> "Monkey";
//		Future<?> result1 = service.schedule(task1, 1, TimeUnit.SECONDS);
//		Future<?> result2 = service.schedule(task2, 2, TimeUnit.SECONDS);
//		System.out.println(result1.get() + " " + result2.get());
//		service.shutdown();

		ExecutorService es = Executors.newFixedThreadPool(1);
		es.submit(new Test().new Printer());
		System.out.println("HELLO");
		es.shutdown();
	}
}
