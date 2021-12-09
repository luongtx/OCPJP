package concurency.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class ForkjoinFibo extends RecursiveTask<Long> {

	private static final long serialVersionUID = 1L;
	private final long n;

	public ForkjoinFibo(long n) {
		// TODO Auto-generated constructor stub
		this.n = n;
	}

	@Override
	protected Long compute() {
		if (n <= 1)
			return n;
		ForkjoinFibo task1 = new ForkjoinFibo(n - 1);
		ForkjoinFibo task2 = new ForkjoinFibo(n - 2);
		task1.fork();
		return task2.compute() + task1.join();
	}
}

class Fibo {
	private long n;

	Fibo(long n) {
		this.n = n;
	}

	public long compute() {
		if (n <= 1)
			return n;
		long f = 0;
		long f1 = 0;
		long f2 = 1;
		for (long i = 2; i <= n; i++) {
			f = f1 + f2;
			f1 = f2;
			f2 = f;
		}
		return f;
	}
}

public class FiboTest {
	public static long NUM = 1000;

	public static void main(String[] args) {
		System.out.println("Fibo of " + NUM + ": ");
		long t0 = System.currentTimeMillis();
		System.out.println("normal fibo: " + new Fibo(NUM).compute());
		System.out.println("exec time: " + (System.currentTimeMillis() - t0));

		t0 = System.currentTimeMillis();
		ForkjoinFibo task = new ForkjoinFibo(NUM);
		System.out.println("forkjoin fibo: " + new ForkJoinPool().invoke(task));
		System.out.println("exec time: " + (System.currentTimeMillis() - t0));
	}
}
