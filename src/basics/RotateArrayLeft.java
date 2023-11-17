package basics;

import java.util.Arrays;

public class RotateArrayLeft {
public static void main(String[] args) {
int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int target = 3;
for (int i = 0; i < target; i++) {
int first = arr[0];
for (int j = 0; j < arr.length - 1; j++) {
arr[j] = arr[j + 1];
	}
	arr[arr.length - 1] = first;
		}
for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i]);
		}
	}
}
