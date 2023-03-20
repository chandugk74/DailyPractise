package basics;

public class ClosestToTargetNumber2 {
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 4, 6, 9 };

		System.out.println(findClosest(arr, 3));
		System.out.println(findClosest(arr, 7));
		System.out.println(findClosest(arr, 8));
	}

	public static int findClosest(int[] arr, int target) {
		int idx = 0;
		int dist = Math.abs(arr[0] - target);

		for (int i = 1; i < arr.length; i++) {
			int cdist = Math.abs(arr[i] - target);

			if (cdist < dist) {
				idx = i;
				dist = cdist;
			}
		}

		return arr[idx];
	}
}
