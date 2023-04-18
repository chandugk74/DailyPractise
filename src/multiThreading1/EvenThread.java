package multiThreading1;

public class EvenThread extends Thread{
	
	private EvenOddNumber obj;
	
	public EvenThread(EvenOddNumber obj) {
		this.obj=obj;
	}
	@Override
	public void run() {
		obj.generateEvenNumbers();
	}

}
