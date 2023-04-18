package multiThreading1;

public class OddThread extends Thread {
	private EvenOddNumber obj;

	public OddThread(EvenOddNumber obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		obj.generateOddNumbers();
	}

}
