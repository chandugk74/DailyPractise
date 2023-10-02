package dsa;

public class LinearSearch {
public static void main(String[] args) {
int[] arr = { 12, 34, 45, 67, 89, 123, 456 };
		int target = 89;
		int foundIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				foundIndex = i;
			break; 
			}
		}
		if (foundIndex != -1) {
			System.out.println(foundIndex);
		} else {
System.out.println("Element not found");
		}
	}
}
