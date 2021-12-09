package concurency.parallel_stream;

import java.util.concurrent.ForkJoinPool;

public class NumProcessorsTest {
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(ForkJoinPool.commonPool().getParallelism());
	}
}
