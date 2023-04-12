package leetCode;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne1 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		int[] result = indexSum(arr);
		System.out.println(Arrays.toString(result));
	}

	public static int[] indexSum(int[] arr) {
		int length = arr.length;
		for (int i = length - 1; i >= 0; i++) {
			if (arr[i] < 9) {
				arr[i]++;
				return arr;
			}
		}
		throw new IllegalArgumentException("not found");
	}
}
