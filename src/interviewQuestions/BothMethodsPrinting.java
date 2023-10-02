package interviewQuestions;
class A2 {
    void show() {
        System.out.println("Class A's show method");
    }
}

class B2 extends A2 {
    void show() {
        super.show(); // Calls Class A's show method using super keyword
        System.out.println("Class B's show method");
    }
}
public class BothMethodsPrinting {

	public static void main(String[] args) {
	     B2 b2 = new B2();
	        b2.show(); // Calls Class B's show method, which in turn calls Class A's show method
//	    A2 a2 = new A2();
//	    	a2.show();

	}

}
