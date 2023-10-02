package blind75;

import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		System.out.println(isDuplicatePresent(arr));
	}
	private static boolean isDuplicatePresent(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for (int nums : arr) {
			if (!set.add(nums)) {
				return true;
			}
		}
		return false;
	}
}
