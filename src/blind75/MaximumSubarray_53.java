package blind75;

public class MaximumSubarray_53 {

	public static void main(String[] args) {
		int[] nums = { 5, 4, -1, 7, 8 };
		System.out.println(maximumSubArray(nums));
	}

	private static int maximumSubArray(int[] nums) {
		int sum = 0;
		int max_sum = nums[0];
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			if (sum > max_sum) {
				max_sum = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		return max_sum;
	}
}
