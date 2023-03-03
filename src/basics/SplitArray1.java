package basics;

import java.util.ArrayList;
import java.util.List;

public class SplitArray1 {
	public static void main(String[] args) {
		int[] original = { 1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int splitSize = 3;
		SplitArray1 sample = new SplitArray1();
		sample.splitArr(original, splitSize);
	}
	private void splitArr(int[] original, int splitSize) {
		int k = original.length;
		int j = 0;
		while (j < k) {
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < splitSize; i++) {
				list.add(original[j]);
				j++;
				if (j == k)
					break;
			}
			System.out.println(list);
		}
	}
}
