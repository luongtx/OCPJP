package concurency;

public class ThreadTest2 {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		//start a new thread and call run method
		thread.start();
		
		//no thread created, simply call run on current thread
		thread.run();
//		System.out.println(thread.getName());
	}
}
