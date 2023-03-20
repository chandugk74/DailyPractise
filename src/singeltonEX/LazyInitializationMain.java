package singeltonEX;

public class LazyInitializationMain {
	public static void main(String[] args) {
		LazyInitialization l1 = LazyInitialization.getInstance();
		LazyInitialization l2 = LazyInitialization.getInstance();
		if (l1 == l2) {
			System.out.println("objects are same");
		} else {
			System.out.println("objects are not same");
		}

	}
}
