package basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateIntegersInList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5, 6);
		Set<Integer> noDups = new HashSet<Integer>();
		Set<Integer> dups = new HashSet<Integer>();
		for (Integer num : list) {
			if (!noDups.add(num)) {
				dups.add(num);
			}
		}
		System.out.println(dups);
	}

}
