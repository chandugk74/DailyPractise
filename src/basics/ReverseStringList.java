package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Chandra", "Nalina"));
//		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		for (int i = 0, j = list.size() - 1; i < j; i++) {
//			removes an element from the end of the list and insert it into the very beginning, one at a time
			list.add(i, list.remove(j));
			}
		System.out.println(list);
	}
}
