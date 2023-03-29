package leetCode;

import java.util.Arrays;

public class PushZeroLast {

	public static void main(String[] args) {
		int nums[] = { 0, 1, 0, 2, 3, 0, 0, 0, 2 };
		moveZeroes(nums);
	}

	public static void moveZeroes(int[] nums) {
//		if (nums == null || nums.length == 0)
//			return;
//
		int insertPos = 0;
		for (int num : nums) {
			if (num != 0)
				nums[insertPos++] = num;
		}

		while (insertPos < nums.length) {
			nums[insertPos++] = 0;
		}
		System.out.println(Arrays.toString(nums));
	}
}
