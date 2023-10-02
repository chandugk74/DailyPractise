package blind75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//You are given an integer array nums. A number x is lonely when it appears only once,
//and no adjacent numbers (i.e. x + 1 and x - 1) appear in the array.
//Return all lonely numbers in nums. You may return the answer in any order.
public class AllLonelyNumbersInArray_2150 {
	public static void main(String[] args) {
		int[] nums = { 10, 6, 5, 8};
		System.out.println(LonleyNumbers(nums));
	}
	private static List<Integer> LonleyNumbers(int[] nums) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (hm.containsKey(nums[i])) {
				hm.put(nums[i], hm.get(nums[i]) + 1);
			} else {
				hm.put(nums[i], 1);
			}
		}
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
if (hm.get(nums[i]) == 1 && !hm.containsKey(nums[i] + 1)
&& !hm.containsKey(nums[i] - 1)) {
				list.add(nums[i]);
			}
		}
		return list;
	}
}


//Example 1:
//
//Input: nums = [10,6,5,8]
//Output: [10,8]
//Explanation: 
//- 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
//- 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
//- 5 is not a lonely number since 6 appears in nums and vice versa.
//Hence, the lonely numbers in nums are [10, 8].
//Note that [8, 10] may also be returned.
