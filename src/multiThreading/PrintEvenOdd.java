package multiThreading;

import sun.rmi.runtime.NewThreadAction;
class NewThread implements Runnable {
	public void run() {
		String name = Thread.currentThread().getName();
		switch (name) {
		case "T1":
			for (int i = 1; i <= 10; i++) {
				if (i % 2 != 0) {
		System.out.println(name + "-OddThread: " + i);
				}try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}	}
			break;
		case "T2":
			for (int i = 1; i <= 10; i++) {
				if (i % 2 == 0) {
		System.out.println(name + "-EvenThread: " + i);
				}try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				} }
			break;
		} } }
public class PrintEvenOdd {
	public static void main(String[] args) {
		NewThread t1 = new NewThread();
		Thread thread1 = new Thread(t1);
		thread1.setName("T1");
		thread1.start();
		NewThread t2 = new NewThread();
		Thread thread2 = new Thread(t2);
		thread2.setName("T2");
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (Exception e) {	System.out.println(e);	}
		System.out.println("program completed.....");
	} }
