package blind75;

public class SearchInsertPosition_35 {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 7 };
		int target = 3;
		System.out.println(searchInsertPosition(nums, target));
	}

	public static int searchInsertPosition(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				end = mid - 1;
			} else if (nums[mid] < target) {
				start = mid + 1;
			}
		}
		return start;
	}

}
