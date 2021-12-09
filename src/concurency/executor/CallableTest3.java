package concurency.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Printer3 implements Callable<String> {
    public String call() {
        System.out.println("DONE");
        return null;
    }
}
 
public class CallableTest3 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        es.submit(new Printer3());
        System.out.println("HELLO");
        es.shutdown();
    }
}