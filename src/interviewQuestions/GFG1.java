package interviewQuestions;

class Parent {
	void method() {
		System.out.println("Method from Parent");
	}
}

class Child extends Parent {
	@Override
	void method() {
		System.out.println("Method from Child");
	}
}

public class GFG1 {
	public static void main(String[] args) {
		Parent p = new Child();
		p.method();

		Parent p1 = new Parent();
		p1.method();
	}
}
