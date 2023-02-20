package basics;

import java.util.Arrays;

public class BubbleMethodAscending {

	public static void main(String[] args) {
		int[] ll = { 2, 5, 8, 6, 7, 9, 2, 3, 1 };
		int n = ll.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (ll[j] > ll[j + 1]) {
					int temp = ll[j];
					ll[j] = ll[j + 1];
					ll[j + 1] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(ll));
	}

}
