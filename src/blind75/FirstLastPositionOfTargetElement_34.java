package blind75;

import java.util.Arrays;

//Given an array of integers nums sorted in non-decreasing order,
//find the starting and ending position of a given target value.
public class FirstLastPositionOfTargetElement_34 {
	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		System.out.println(Arrays.toString(firstLastPositionOfElement(nums, target)));
	}

	static int[] firstLastPositionOfElement(int[] nums, int target) {
		int[] arr = new int[2];
		arr[0] = arr[1] = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				arr[0] = i;
				while (i < nums.length && nums[i + 1] == target) {
					i++;
					arr[1] = i;
					break;
				}
			}
		}
		return arr;
	}
}
