package basics;

public class PrimeNumberPrintingUpTo {
	public static void main(String[] args) {
		int numb = 100;
		int total = 0;
		for (int i = 2; i <= numb; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				total++;
				System.out.print(i + " ");
			}
		}
		System.out.print("total prime numbers:" + total);
	}

}
