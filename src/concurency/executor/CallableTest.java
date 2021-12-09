package concurency.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Caller implements Callable<Void> {
	String str;

	public Caller(String s) {
		this.str = s;
	}

	public Void call() throws Exception {
		System.out.println(str.toUpperCase());
		return null;
	}
}

public class CallableTest {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newSingleThreadExecutor();
		Future<Void> future = es.submit(new Caller("Call"));
		System.out.println(future.get());
	}
}