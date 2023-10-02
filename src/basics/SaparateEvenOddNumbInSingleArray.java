package basics;

public class SaparateEvenOddNumbInSingleArray {

	public static void main(String[] args) {
		int[] num1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		EvenOdd(num1);
//	}
//
//	public static void EvenOdd(int num1[]) {
		int[] result = new int[num1.length];
		int index = 0;
		for (int i = 0; i < num1.length; i++) {
			if (num1[i] % 2 == 0) {
				result[index] = num1[i];
				index++;
			}
		}
		for (int i = 0; i < num1.length; i++) {
			if (num1[i] % 2 != 0) {
				result[index] = num1[i];
				index++;
			}
		}
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ", ");
		}
	}

}
