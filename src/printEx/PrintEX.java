package printEx;

public class PrintEX {

	public static void main(String[] args) {
		System.out.printf("Hello %s!%n", "World");
//		The %n separator printf() will automatically insert the host system's native line separator.
		System.out.printf("baeldung%nline%nterminator");
		System.out.printf("%b%n", null);
		System.out.printf("%B%n", false);
//		Notice that we can use %B for uppercase formatting.
		System.out.printf("%B%n", 5.3);
		System.out.printf("%b%n", "random text");
		System.out.printf("'%s' %n", "baeldung");
		System.out.printf("'%S' %n", "baeldung");
		System.out.printf("%c%n", 's');
		System.out.printf("%C%n", 's');
		
	}

}
