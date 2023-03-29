package basics;

public class ThreeIncreasingAdjacentNumbers {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 7, 5, 9 };
		int b[] = { 1, 4, 5, 6, 2 };
		int c[] = { 1, 2, 4, 5 };
		System.out.println(ThreeIncreasingAdjacentNumbers.tripleUp(a));
		System.out.println(ThreeIncreasingAdjacentNumbers.tripleUp(b));
		System.out.println(ThreeIncreasingAdjacentNumbers.tripleUp(c));
	}

	public static boolean tripleUp(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2) {
//				       2			1	+1			3			1    + 2
				return true;
			}
		}
		return false;
	}
}
