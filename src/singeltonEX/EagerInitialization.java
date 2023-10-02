package singeltonEX;

public class EagerInitialization {
	// Private static instance created at the time of class loading
    private static final EagerInitialization instance = new EagerInitialization();

    // Private constructor to prevent instantiation from other classes
    private EagerInitialization() {
    }

    // Public static method to get the instance of the class
    public static EagerInitialization getInstance() {
        return instance;
    }

    // Example method of the Singleton class
    public void showMessage() {
        System.out.println("Hello from Eager Singleton!");
    }

    public static void main(String[] args) {
        // Get the instance of the Singleton class
    	EagerInitialization singleton = EagerInitialization.getInstance();

        // Call a method of the Singleton
        singleton.showMessage();
    }
}