package basics;

import java.util.Arrays;

public class Seggrate0And1 {
	public static void main(String[] args) {
		int[] A = { 0, 1, 1, 0, 1, 0, 1, 1, 0 };
		Arrays.sort(A);
		System.out.print(Arrays.toString(A));
//		int sum = 0;
//		for (int i = 0; i < A.length; i++)
//			sum = sum + A[i];
//
//		Arrays.fill(A, A.length - sum, A.length, 1);
//		Arrays.fill(A, 0, A.length - sum, 0);
//		System.out.println(Arrays.toString(A));

	}
}
