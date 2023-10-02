package blind75;

import java.util.HashMap;
import java.util.Map;

public class FindLuckyIntegerInArray_1394 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3 };
		System.out.println(findLuckyNumber(nums));

	}

	public static int findLuckyNumber(int[] nums) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (hm.containsKey(nums[i])) {
				hm.put(nums[i], hm.get(nums[i]) + 1);
			} else {
				hm.put(nums[i], 1);
			}
		}
		int x = 0;
		int max = -1;
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getKey() == entry.getValue()) {
				x = entry.getValue();
				max = Math.max(x, max);
			}

		}
		return max;
	}

}
