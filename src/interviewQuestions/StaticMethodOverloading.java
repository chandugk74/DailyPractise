package interviewQuestions;

public class StaticMethodOverloading {

	public static void foo() {
        System.out.println("Test.foo() called ");
    }
    public static void foo(int a) {
        System.out.println("Test.foo(int) called ");
    }
    public static void main(String args[])
    {
    	StaticMethodOverloading.foo();
    	StaticMethodOverloading.foo(10);
    }

}
