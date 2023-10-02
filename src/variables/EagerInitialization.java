package variables;

public class EagerInitialization {
	//create private static variable
	private static EagerInitialization instance
					= new EagerInitialization();
	//private constructor
	private EagerInitialization() {
		
	}
	private static EagerInitialization getInstance() {
		return instance;
	}
	public static void printMessage() {
		System.out.println("this is Eager instance");
	}
	public static void main(String[] args) {
EagerInitialization eagerInitialization
			= EagerInitialization.getInstance();
		eagerInitialization.printMessage();
	}
}
