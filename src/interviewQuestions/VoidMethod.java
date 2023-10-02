package interviewQuestions;

class A1 {
	void show() {
		System.out.println("Class A's static show method");
	}
}

class B1 extends A1 {
	void show() {
		System.out.println("Class B's static show method");
	}
}

public class VoidMethod {
	public static void main(String[] args) {
		A1 o = new B1();
		o.show(); // Calls the show method of class B
		
//		B1 b1= new B1();
//		b1.show();
	
//		A1 a1= new A1();
//		a1.show();
	}
}
