package basics;

import java.util.Arrays;

public class RemoveEvenIntegersFromArray {
	public static int[] removeEven(int[] arr) {
		int oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddCount++;
			}
		}
		int[] result = new int[oddCount];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				result[index] = arr[i];
				index++;
			}
		}
		Arrays.toString(result);
		return result;
	}
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] result = removeEven(arr);
		System.out.println(Arrays.toString(result));
	}

}
