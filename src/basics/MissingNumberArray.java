package basics;

import java.util.HashSet;
import java.util.Set;

public class MissingNumberArray {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 7, 1, 9, 6 };
		Set<Integer> numSet = new HashSet<>();
		for (int num : arr) {
			numSet.add(num);
		}
// Define the range of numbers (you can adjust this based on your problem).
		int startRange = 1; // Starting number
		int endRange = 9; // Ending number
		for (int i = startRange; i <= endRange; i++) {
			if (!numSet.contains(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
