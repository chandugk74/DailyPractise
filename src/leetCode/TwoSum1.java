package leetCode;

import java.util.Arrays;

public class TwoSum1 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		int target = 3;
		int result[] = twoSum(array, target);
		System.out.println(Arrays.toString(result));
	}

	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int compliment = target - nums[i];
				if (nums[j] == compliment) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("not found");
	}
}
