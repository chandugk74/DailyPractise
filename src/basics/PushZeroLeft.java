package basics;

import java.util.Arrays;
import java.util.LinkedList;

public class PushZeroLeft {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 1, 0, 0, 0, 0 };
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				list.addFirst(arr[i]);
			} else {
				list.addLast(arr[i]);
			}
		}
		System.out.println(list);
	}
}