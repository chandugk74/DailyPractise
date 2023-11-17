package lambdaExpression;

@FunctionalInterface
interface MyFunctionalInterface {
	public int abstractMethod(int a, int b);

	default void defaultMethod() {
		System.out.println("This is a default method.");
	}

	static void staticMethod() {
		System.out.println("This is a static method.");
	}
}

public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface myInterface = (a, b) -> a * b;
		System.out.println(myInterface.abstractMethod(5, 5));
		myInterface.defaultMethod();
		MyFunctionalInterface.staticMethod();
	}
}
