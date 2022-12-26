package basics;

public class EvenOddByEnhancedforLoop {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		System.out.println("the even numbers are...");
		for (int value : a) {
			if (value % 2 == 0)
				System.out.println(value);
		}
		System.out.println("the odd numbers are...");
		for (int value : a) {
			if (value % 2 != 0)
				System.out.println(value);
		}
	}
}
