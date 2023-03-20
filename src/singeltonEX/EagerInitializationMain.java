package singeltonEX;

public class EagerInitializationMain {

	public static void main(String[] args) {
		EagerInitialization e1 = EagerInitialization.getInstance();
		EagerInitialization e2 = EagerInitialization.getInstance();
		if (e1 == e2) {
			System.out.println("objects are same");
		} else {
			System.out.println("objects not same");
		}
	}

}
