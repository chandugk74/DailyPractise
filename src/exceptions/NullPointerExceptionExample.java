package exceptions;

public class NullPointerExceptionExample {
			
	public static void main(String[] args) {
		printLength(null);
		System.out.println("length printed");
	}
	public static void printLength(String str) {
		System.out.println(str.length());
	}
}
