package concurency.callable_n_executor;
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

public class FutureGetTest {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newSingleThreadExecutor();
		MyCallable callable = new MyCallable(1);
//        es.submit(callable);
		System.out.println(es.submit(callable).get());
		es.shutdown();
	}
	/*
	 * note: throws Exception
	 */
}
