package blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingMap_1 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		int target = 5;
		int result[] = twoSum(array, target);
		System.out.println(Arrays.toString(result));
	}

	private static int[] twoSum(int[] array, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(target - array[i])) {
				result[1] = i;
				result[0] = map.get(target - array[i]);
				return result;
			}
			map.put(array[i], i);
		}
		return result;
	}

}
