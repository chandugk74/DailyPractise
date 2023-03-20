package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseStringList {

	public static void main(String[] args) {
//		List<String> list = new ArrayList<>(Arrays.asList("Chandra", "Nalina"));
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		for (int i = 0, j = list.size() - 1; i < j; i++) {
			list.add(i, list.remove(j));
		}
		System.out.println(list);
	}
}
