package concurency.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Printer implements Runnable {
    public void run() {
        System.out.println("Printing");
    }
}
 
public class ExecutorServiceTest3 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        /*INSERT*/
        es.submit(new Printer());
        es.execute(new Printer());
        es.shutdown();
    }
}