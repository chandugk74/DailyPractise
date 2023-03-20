package basics;

public class CountEvenOddDigits {

	public static void main(String[] args) {
		int num = 123456;
		System.out.println("The given integer = "+ num);
		int even_count = 0;
		int odd_count = 0;

		while (num > 0) {
			int remainder = num % 10;
			if (remainder % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			num = num / 10;
		}
		System.out.println("Number of even digits is =" + even_count);
		System.out.println("Number of odd digits is =" + odd_count);
	}
}
