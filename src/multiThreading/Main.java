package multiThreading;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		MyThread thread1 = new MyThread();
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1);
		thread1.start();
//		thread1.join();
//      join() will execute the first thread and then it will allow to second thread to execute
		thread2.start();
	}
}
