package basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Seggrate0And {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 1, 0, 0, 0, 0 };
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				list.addFirst(arr[i]);
			} else {
				list.addLast(arr[i]);
			}
		}
		System.out.println(list);
	}

}
