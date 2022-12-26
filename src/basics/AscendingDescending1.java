package basics;

import java.util.Arrays;

public class AscendingDescending1 {
	public static void main(String[] args) {
		int[] num = { 5, 6, 1, 8, 10, 56, 47, 55 };
		int ll = num.length;
		Arrays.sort(num);
		// printing first half in ascending order
		for (int i = 0; i < ll / 2; i++) {
			System.out.print(num[i] + " ");
		}
		// printing second half in descending order
		for (int j = ll - 1; j > ll / 2; j--) {
			System.out.print(num[j] + " ");
		}
	}
}
