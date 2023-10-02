package interviewQuestions;

 class A {
	 static void show() {
	        System.out.println("Class A's static show method");
	    }
	}

	class B extends A {
	    static void show() {
	        System.out.println("Class B's static show method");
	    }
	}

	public class StaticMethod {
	    public static void main(String[] args) {
	    	A o = new B();
	        o.show(); // Calls the static show method of class A
	        
	        B b= new B();
			b.show(); // Calls the static show method of class B
			
			A a= new A();
			a.show(); // Calls the static show method of class A
	    }
}
