package interviewQuestions;

class c {
	void sum(double a) {
		// Implementation for sum with double parameter
	}

	void sum(float a) {
		// Implementation for sum with float parameter
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		c c = new c();
		c.sum(1.0); // Calling the sum method with a double argument
		c.sum(1.0f); // Calling the sum method with a float argument
		
	}

}
