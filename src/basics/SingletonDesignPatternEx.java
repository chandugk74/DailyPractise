package basics;

public class SingletonDesignPatternEx {
//	create private static variable,	object
	private static SingletonDesignPatternEx singleton_instance = null;
//	private constructor
	private SingletonDesignPatternEx() {

	}
	// using factory method, getInstance() is static method
	public static SingletonDesignPatternEx getInstance() {
		if (singleton_instance == null) {
			singleton_instance = new SingletonDesignPatternEx();
		}
		return singleton_instance;
	}
// call any method
	public void getContactDetails() {
		System.out.println("Contact Details");
	}
	public static void main(String[] args) {
		SingletonDesignPatternEx obj1 = SingletonDesignPatternEx.getInstance();
		System.out.println(obj1);
	}
}
