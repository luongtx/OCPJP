package concurency.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread2 implements Runnable {
    private String str;
 
    MyThread2(String str) {
        this.str = str;
    }
 
    public void run() {
        System.out.println(str.toUpperCase());
    }
}

public class ExecutorServiceTest2 {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		MyThread2 thread = new MyThread2("luong");
		Future future = executorService.submit(thread);
		Integer tmp = (Integer) future.get();
		System.out.println(tmp);
		executorService.shutdown();	
	}
}
