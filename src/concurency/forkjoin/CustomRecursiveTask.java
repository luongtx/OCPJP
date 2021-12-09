package concurency.forkjoin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class CustomRecursiveTask extends RecursiveTask<Integer> {
	private int[] arr;

	private static final int THRESHOLD = 20;

	public CustomRecursiveTask(int[] arr) {
		this.arr = arr;
	}

	@Override
	protected Integer compute() {
		if (arr.length > THRESHOLD) {
			return ForkJoinTask.invokeAll(createSubtasks()).stream().mapToInt(ForkJoinTask::join).sum();
		} else {
			return processing(arr);
		}
	}

	private Collection<CustomRecursiveTask> createSubtasks() {
		List<CustomRecursiveTask> dividedTasks = new ArrayList<>();
		dividedTasks.add(new CustomRecursiveTask(Arrays.copyOfRange(arr, 0, arr.length / 2)));
		dividedTasks.add(new CustomRecursiveTask(Arrays.copyOfRange(arr, arr.length / 2, arr.length)));
		return dividedTasks;
	}

	private Integer processing(int[] arr) {
		return Arrays.stream(arr).filter(a -> a > 10 && a < 27).map(a -> a * 10).sum();
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 6, 7, 9, 10, 15, 12, 5, 15, 1, 7, 1, 2, 5, 6, 7, 9, 10, 15, 12, 5, 15, 1, 7 };
		CustomRecursiveTask customRecursiveTask = new CustomRecursiveTask(arr);
		ForkJoinPool pool = new ForkJoinPool();
		int result = pool.invoke(customRecursiveTask);
		System.out.println(result);
	}
}