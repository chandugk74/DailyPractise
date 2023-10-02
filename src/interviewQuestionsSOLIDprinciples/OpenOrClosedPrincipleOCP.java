package interviewQuestionsSOLIDprinciples;

public class OpenOrClosedPrincipleOCP {
//	OCP suggests that software entities should be open for extension but closed for modification.
	// Violating OCP - Modifying existing code
	class Shape {
	    void draw() {
	        // Draw the shape
	    }
	}

	// Adding a new shape
	class Circle extends Shape {
	    void draw() {
	        // Draw a circle
	    }
	}
//*******  To follow OCP, you can use abstraction and extension without modifying existing code
	interface Drawable {
	    void draw();
	}

	class Size implements Drawable {
	    public void draw() {
	        // Draw the shape
	    }
	}

	class Circle1 implements Drawable {
	    public void draw() {
	        // Draw a circle
	    }
	}

}
