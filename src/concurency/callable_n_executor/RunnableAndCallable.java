package concurency.callable_n_executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Greetings implements Runnable, Callable<String> {
	void greet(String s) {

	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "greettings";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run");
	}

}

class MyCallable2 implements Callable<String> {

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "MyCallable";
	}

}

public class RunnableAndCallable {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newSingleThreadExecutor();
//		Greetings g = () -> "Hello";
		Greetings g = new Greetings();
//		Future<String> f = es.execute(() -> "HELLO");
//		Future<String> f = es.execute(g);
		es.execute(g);
//		es.submit(g);
//		System.out.println(f.get());

		MyCallable2 callable = new MyCallable2();
		MyRunnable runnable = new MyRunnable() {
//			public void run() {
//				System.out.println("run");
//			}
		};
		System.out.println(es.submit(callable).get());
		es.submit(runnable);
		es.shutdown();
	}
}