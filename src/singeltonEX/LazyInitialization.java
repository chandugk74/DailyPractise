package singeltonEX;
//advantage: objects created only when required
//disadvantage : can't handle multiple threads
public class LazyInitialization {
// Private static variable to hold the 
//	single instance of the class
    private static LazyInitialization instance;
// Private constructor to prevent 
//    instantiation from other classes
    private LazyInitialization() {
    }
    // Public static method to get the instance of the class
    public static LazyInitialization getInstance() {
        if (instance == null) {
            instance = new LazyInitialization();
        }
        return instance;
    }
    // Example method of the Singleton class
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        // Get the instance of the Singleton class
LazyInitialization singleton = LazyInitialization.getInstance();

        // Call a method of the Singleton
        singleton.showMessage();
    }
}
