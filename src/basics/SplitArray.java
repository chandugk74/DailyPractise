package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArray {
	public static void main(String[] args) {
		int[] original = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int splitSize = 3;
		List<int[]> list = splitArray(original, splitSize);
		list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
	}
	public static List<int[]> splitArray(int[] array, int splitSize) {
		int k = array.length;
		int j = 0;
		List<int[]> list = new ArrayList<>();
			while (j < k) {
				int[] arr1 = new int[splitSize];
				for (int i = 0; i < splitSize; i++) {
					arr1[i] = array[j];
					++j;
					if (j == k)
						break;
				}
				list.add(arr1);
			}
			return list;
		}
}
