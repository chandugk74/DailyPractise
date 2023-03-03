package basics;

import java.util.Arrays;

public class PushZeroLeft {

	public static void main(String[] args) {
		int[] arr = new int[] {99, 1, 10, 20, 0, 0, 88, 0 };
		int count = arr.length - 1;
		for (int i = 0; i < count; i++) {
			arr[count] = arr[i];
		}
		Arrays.sort(arr);
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}