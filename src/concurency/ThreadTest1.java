package concurency;

class MyThread extends Thread {

	public MyThread(String name) {
		// TODO Auto-generated constructor stub
		super.setName(name);
	}

	public MyThread() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Current thread name: " + Thread.currentThread().getName());
	}
}

class YourThread implements Runnable {

	public YourThread() {
		// TODO Auto-generated constructor stub
		System.out.println("Current thread name: " + Thread.currentThread().getName());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Current thread name: " + Thread.currentThread().getName());
	}

}

public class ThreadTest1 {
	public static void main(String[] args) throws InterruptedException {
		MyThread thread1 = new MyThread();
		thread1.start();
//		thread1.start();
		System.out.println(thread1.getName());

		Thread thread3 = new Thread(new YourThread());
		thread3.start();
		System.out.println(thread3.getName());
	}
}
