package basics;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
//		Integer[] ll = {1,22,39,42,46,55};
//		Arrays.sort(ll);
//		System.out.println(ll[ll.length-2]);
		int arr[] = { 11, 55, 2, 56, 55, 77, 65, 77, 66 };
		int max = 0, scndmax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				scndmax = max;
				max = arr[i];
			} else if (scndmax < arr[i] && arr[i] != max) {
				scndmax = arr[i];
			}
		}
		System.out.println(scndmax);
	}
}
