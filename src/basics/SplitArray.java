package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArray {
	public static void main(String[] args) {
		int[] original = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int splitSize = 3;
		/*
		 * expected Output [0, 1, 2] [3, 4, 5] [6, 7, 8] [9]
		 */
		List<int[]> list = splitArray(original, splitSize);
		list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
	}

	public static List<int[]> splitArray(int[] array, int splitSize) {
		List<int[]> out = new ArrayList<>();
		int a = array.length % splitSize;
		int[] arr = new int[splitSize];
		int[] arr1 = new int[splitSize];
		int[] arr2 = new int[splitSize];
		int[] arr3 = new int[1];
		int count = 0;
		System.arraycopy(array, count, arr, 0, splitSize);
		System.arraycopy(array, count = count + splitSize, arr1, 0, splitSize);
		System.arraycopy(array, count = count + splitSize, arr2, 0, splitSize);
		System.arraycopy(array, count = count + splitSize, arr3, 0, a);
		out.add(arr);
		out.add(arr1);
		out.add(arr2);
		out.add(arr3);
		return out;
	}
}
