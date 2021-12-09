package concurency.executor;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Player extends Thread {
	CyclicBarrier cb;

	public Player() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Player(CyclicBarrier cb) {
		this.cb = cb;
	}

	public void run() {
		try {
			cb.await();
		} catch (InterruptedException | BrokenBarrierException e) {
		}
	}
}

class Match implements Runnable {
	public void run() {
		System.out.println("Match is starting...");
	}
}

public class CyclicBarrierTest {
	public static void main(String[] args) {
		Match match = new Match();
		CyclicBarrier cb = new CyclicBarrier(2, match);
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.submit(new Player2(cb));
		es.submit(new Player2(cb));
		es.shutdown();
	}
}