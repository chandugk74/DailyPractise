package basics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DeleteDuplicateElementsIntArry1 {
	public static void main(String[] args) {
		int a[] = { 5, 2, 6, 8, 6, 7, 5, 2, 8 };
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++)
			set.add(a[i]);
		System.out.print(set);
	}

}
