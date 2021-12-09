package concurency.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyCallable implements Callable<Integer> {
	private Integer i;

	public MyCallable(Integer i) {
		this.i = i;
	}

	public Integer call() throws Exception {
		return --i;
	}
}

class MyThread extends Thread {
	private int i;

	MyThread(int i) {
		this.i = i;
	}

	public void run() {
		i++;
	}
}

public class CallableTest2 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newSingleThreadExecutor();
		MyCallable callable = new MyCallable(100);
		System.out.println(es.submit(callable).get());
		System.out.println(es.submit(callable).get());
		
		MyThread thread = new MyThread(100);
		System.out.println(es.submit(thread).get());
		es.shutdown();
	}
}