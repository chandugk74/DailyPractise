package blind75;

public class FindLuckyIntegerInArray {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 3,3, 4 };
		System.out.println(findLuckyNumber(nums));

	}

	private static int findLuckyNumber(int[] nums) {
		int[] numbers = new int[501];
		for (int number : nums) {
			numbers[number]++;
		}
		for (int i = 500; i > 0; i--) {
			if (i == numbers[i]) {
				return i;
			}
		}
		return -1;
	}

}
