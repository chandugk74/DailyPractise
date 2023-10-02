package exceptions;

public class ThrowsExample {

	public static void main(String[] args) {
		int x=0;
		try {
		 x = divide(6, 2);
		}catch (ArithmeticException e) {
			System.out.println("cannot devide by zero");
		}
		System.out.println(x);

	}

	public static int divide(int a, int b) throws ArithmeticException {
		return a / b;
	}

}
