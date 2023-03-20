package singeltonEX;

//advantage: objects created only when required
// disadvantage : can't handle multiple threads
public class LazyInitialization {
// private static variable 
	private static LazyInitialization theOnlyInstance = null;

//	private constructor
	private LazyInitialization() {

	}

	public static LazyInitialization getInstance() {
		if (theOnlyInstance == null) {
			theOnlyInstance = new LazyInitialization();
		}
		return theOnlyInstance;
	}

}
