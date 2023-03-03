package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseStringList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Chandra", "Nalina"));

		for (int i = 0, j = list.size() - 1; i < j; i++) {
			list.add(i, list.remove(j));
		}
		System.out.println(list);
	}

}
