package blind75;

public class MaxConsecutiveOnes_485 {

	public static void main(String[] args) {
		int[] nums = {1,0,1,1,0,1 };
		System.out.println(maxConsecutive(nums));
	}

	private static int maxConsecutive(int[] nums) {
		int count = 0;
		int max_count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
				max_count = Math.max(max_count, count);
			} else {
				count = 0;
			}
		}
		return max_count;
	}

}
