package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		int target = 5;
		int result[] = twoSum(array, target);
		System.out.println(Arrays.toString(result));
	}

	public static int[] twoSum(int[] nums, int target) {
		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int compliment = target - nums[i];
			if (map.containsKey(compliment)) {
				return new int[] { map.get(compliment), i };
			}
			map.put(nums[i], i);
		}

		throw new IllegalArgumentException("not found");
	}
}
