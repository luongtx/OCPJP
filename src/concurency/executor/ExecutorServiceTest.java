package concurency.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTest {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,
				new LinkedBlockingQueue<Runnable>());

		Runnable runnableTask = () -> {
			try {
				System.out.println("doing runnable task");
				TimeUnit.MILLISECONDS.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Callable<String> callableTask = () -> {
			System.out.println("doing callableTask");
			TimeUnit.MILLISECONDS.sleep(300);
			return "Task's execution";
		};

		List<Callable<String>> callableTasks = new ArrayList<>();
		callableTasks.add(callableTask);
		callableTasks.add(callableTask);
		callableTasks.add(callableTask);

		/*
		 * We can assign tasks to the ExecutorService using several methods including
		 * execute(), which is inherited from the Executor interface, and also submit(),
		 * invokeAny() and invokeAll().
		 */
		executorService.execute(runnableTask);

//		Future<String> future = executorService.submit(callableTask);

		String result = executorService.invokeAny(callableTasks);
		System.out.println(result);
		executorService.shutdown();

		/*
		 * the ExecutorService will first stop taking new tasks and then wait up to a
		 * specified period of time for all tasks to be completed. If that time expires,
		 * the execution is stopped immediately.
		 */
		try {
			if (!executorService.awaitTermination(800, TimeUnit.MILLISECONDS)) {
				System.out.println("shutdown");
				executorService.shutdownNow();
			}
		} catch (InterruptedException e) {
			executorService.shutdownNow();
		}

	}
}