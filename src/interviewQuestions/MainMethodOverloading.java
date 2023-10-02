package interviewQuestions;

public class MainMethodOverloading {

	// Original main() method which accepts String array as an argument.
	public static void main(String args[]) {
		System.out.println("Original main() method called");
		System.out.println("Accepts String array as an argument.");
	}

	// Overloaded main() method
	public static void main() {
		System.out.println("Overloaded main() method called");
	}

	// Overloaded main() method which accepts Integer array as an argument.
	public static void main(Integer args[]) {
		System.out.println("Overloaded main() method called");
		System.out.println("Accepts Integer array as an argument.");
	}

	// Overloaded main method which accepts double value as an argument.
	public static void main(double args) {
		System.out.println("Overloaded main() method called");
		System.out.println("Accepts double value as an argument.");
	}

}
