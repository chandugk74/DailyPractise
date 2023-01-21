package basics;
import java.util.Arrays;
public class MedianOfTwoSortedArrays {
	public static int Solution(int[] arr) {
		int n = arr.length;
		if (n % 2 == 0) {
			int z = n / 2;
			int e = arr[z];
			int q = arr[z - 1];
			int ans = (e + q) / 2;
			return ans;
		} else {
			int z = Math.round(n / 2);
			return arr[z];
		}}
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 6, 5, 4, 89 };
		int i = arr1.length;
		int j = arr2.length;
		int[] arr3 = new int[i + j];
		System.arraycopy(arr1, 0, arr3, 0, i);
		System.arraycopy(arr2, 0, arr3, i, j);
		// Sort the merged array
		Arrays.sort(arr3);
		// calling the method
		System.out.print("Median = " + Solution(arr3));
	}
}
