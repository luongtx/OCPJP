package concurency.executor;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Player2 extends Thread {
	CyclicBarrier cb;

	public Player2() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Player2(CyclicBarrier cb) {
		this.cb = cb;
		start();
	}

	public void run() {
		try {
			cb.await();
		} catch (InterruptedException | BrokenBarrierException e) {
		}
	}
}

public class CyclicBarrierTest2 {
	public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
		Match match = new Match();
		CyclicBarrier cb = new CyclicBarrier(2, match);
		Player2 p1 = new Player2(cb);
//        new Player2(cb);
		cb.await();
	}
}
