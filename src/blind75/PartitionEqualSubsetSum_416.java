package blind75;
//Given an integer array nums, return true if you can partition the 
//array into two subsets such that the sum of the elements in both 
//subsets is equal or false otherwise.
public class PartitionEqualSubsetSum_416 {
	static boolean mem[][];
//checking true or false
	public static boolean canPartition(int[] nums) {
		int sum = 0;
		int n = nums.length;
		for (int i : nums)
			sum += i;
		if (sum % 2 != 0)
			return false;
		sum /= 2;
		mem = new boolean[n + 1][sum + 1];
		return subsetSum(nums, 0, sum);
	}
//printing subset
	static boolean subsetSum(int[] nums, int pos, int sum) {
		if (sum == 0)
			return true;
		else if (pos >= nums.length || sum < 0)
			return false;
		if (mem[pos][sum])
			return true;
return mem[pos][sum] = subsetSum(nums, pos + 1, sum - nums[pos])
				|| subsetSum(nums, pos + 1, sum);
	}

	public static void main(String[] args) {
		int[] nums = { 1, 5, 11, 5 };
		boolean result = canPartition(nums);
		System.out.println(result);
	}
}
