package simplebasics;

import java.util.Arrays;
import java.util.Collections;

public class SingleEx {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 7, 9 };
		int target = 6;
		int temp = Math.abs(arr[0] - target);
		int temp1 = Math.abs(arr[0] - target);
		int dummy = 0;
		int dummy1 = 0;
		for (int i = 0; i < arr.length; i++) {
			int t = Math.abs(arr[i] - target);
			if (t <= temp) {
				temp = t;
				dummy = arr[i];
				if (temp < temp1) {
					temp1 = temp;
					dummy1 = dummy;
				}
			}
		}
		if (temp == temp1 && dummy != dummy1) {
			System.out.println(temp+ " "+ dummy);
			System.out.println(temp1+ " "+ dummy1);
		}else {
			System.out.println(temp+ " "+ dummy);

		}

	}
}