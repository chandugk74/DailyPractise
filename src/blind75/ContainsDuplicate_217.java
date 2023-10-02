package blind75;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate_217 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1 };
		System.out.println(isDuplicatePresent(arr));
	}

	public static boolean isDuplicatePresent(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				return true;
			} else {
				map.put(arr[i], i);
			}
		}
		return false;
	}
}
