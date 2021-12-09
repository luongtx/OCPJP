package concurency.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ScheduleExecutorServiceTest {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

		AtomicInteger i = new AtomicInteger(0);
		long startTime = System.currentTimeMillis();
		Runnable runnableTask = () -> {
			try {
				System.out.println("doing runnable task: " + i.incrementAndGet());
				System.out.println("time elapsed: " + (System.currentTimeMillis() - startTime));
				TimeUnit.MILLISECONDS.sleep(300);
			} catch (InterruptedException e) {
				System.out.println("task is interrupted");
				executorService.shutdownNow();
			}
		};

		Callable<String> callableTask = () -> {
			System.out.println("doing callableTask");
			TimeUnit.MILLISECONDS.sleep(300);
			return "CallableTask done!";
		};

		// Schedule task to run after a fixed delay
		Future<String> resultFuture = executorService.schedule(callableTask, 300, TimeUnit.MILLISECONDS);
		// block until gets result
		System.out.println(resultFuture.get());
		/*
		 * initial delay: 100 ms, after that: run the same task every 450 ms, no matter
		 * the current task is end or not
		 */
//		ScheduledFuture<?> scheduledFuture = executorService.scheduleAtFixedRate(runnableTask, 100, 450,
//				TimeUnit.MILLISECONDS);

		/*
		 * initial delay: 100 ms , after that: pause 150 ms between the end of the
		 * current task and the start of another one:
		 */
		ScheduledFuture<?> scheduledFuture = executorService.scheduleWithFixedDelay(runnableTask, 100, 150,
				TimeUnit.MILLISECONDS);
//		System.out.println(scheduledFuture.get());

//		Thread.sleep(1500);
//		executorService.shutdownNow();
//		System.out.println("stopped!");

		try {
			if (!executorService.awaitTermination(1500, TimeUnit.MILLISECONDS)) {
				System.out.println("shutdown");
				executorService.shutdownNow();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			executorService.shutdownNow();
		}

	}
}
