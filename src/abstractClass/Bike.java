package abstractClass;

public abstract class Bike {
	// constructor
	Bike() {
		System.out.println("It is constructor");
	}

//abstract method
	abstract void run();

	// non-abstract method
	void runFast() {
		System.out.println("Running faster");
	}

}
