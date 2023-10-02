package multiThreading1;

public class EvenOddNumber {
	public static int n = 10;
	int count = 1;

	public void generateEvenNumbers() {
		synchronized (this) {
			while (count < n) {
				while (count % 2 == 1) {
					try {
						wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println("Even Thread :: " + count);
				count++;
				notify();
			}
		}
	}

	public void generateOddNumbers() {
		synchronized (this) {
			while (count < n) {
				while (count % 2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("odd Thread :: " + count);
				count++;
				notify();
			}
		}
	}

	public static void main(String[] args) {
		EvenOddNumber obj = new EvenOddNumber();
		EvenThread evenThread = new EvenThread(obj);
		OddThread oddThread = new OddThread(obj);
		evenThread.start();
		oddThread.start();
	}
}
