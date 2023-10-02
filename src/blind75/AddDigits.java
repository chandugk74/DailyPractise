package blind75;

public class AddDigits {

	public static void main(String[] args) {
		System.out.println(addDigits(18));
		System.out.println(addDigits(99));
	}

	private static int addDigits(int num) {
		if (num == 0) {
			return 0;
		} else {
			return (num % 9 == 0) ? 9 : num % 9;
		}
	}

}
