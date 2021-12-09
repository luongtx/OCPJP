package concurency.executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExecuteTest {
	public static void main(String[] args) {
		ExecutorService es = Executors.newSingleThreadExecutor();
		Future<String> f = es.execute(() -> "HELLO");
//		es.execute(() -> System.out.println("HELLO"));
		System.out.println(f.get());
		es.shutdown();
	}
}
