package basics;

public class SaparateEvenOddNumbInSingleArray1 {
	public static void main(String[] args) {
		int[] num1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int num : num1) {
			if (num % 2 == 0) {
				System.out.print(num + ", ");
			}
		}
		for (int num : num1) {
			if (num % 2 != 0) {
				System.out.print(num + ", ");
			}
		}
	}
}
