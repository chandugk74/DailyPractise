package basics;

public class PrimeEx {

	public static void main(String[] args) {

		int num = 3;
		int count = 0;

		if (num > 1) {
			for (int i = 2; i <= num; i++) {
				if (num % 2 == 0)
					count++;
			}
			if (count == 2) {
				System.out.println(num + " is prime number");
			} else {
				System.out.println(num + " is not a prime number");
			}
		} else {
			System.out.println(num + " is not a prime number");
		}
	}
}
