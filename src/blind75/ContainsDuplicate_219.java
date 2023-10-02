package blind75;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate_219 {

	public static void main(String[] args) {
		int[] nums = { 1, 0, 1, 1 };
		int k = 1;
		System.out.println(containsNearbyDuplicate(nums, k));
	}

	static boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> indices = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			Integer lastIndex = indices.put(nums[i], i);
			if (lastIndex != null && (i - lastIndex) <= k)
				return true;
		}
		return false;
	}

}
//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//
//Example 1:
//Input: nums = [1,2,3,1], k = 3
//Output: true
//
//Example 2:
//Input: nums = [1,0,1,1], k = 1
//Output: true
//
//Example 3:
//Input: nums = [1,2,3,1,2,3], k = 2
//Output: false