package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int[] arr1 = { 50, 22, 15, 40, 65, 75 };
		int[] arr2 = { 60, 45, 10, 20, 35, 56 };
		int count1 = arr1.length;
		int count2 = arr2.length;
		int[] arr3 = new int[count1 + count2];
		int i = 0, j = 0, k = 0;
		while (i < count1) {
			arr3[k] = arr1[i];
			i++;
			k++;
		}
		while (j < count2) {
			arr3[k] = arr2[j];
			j++;
			k++;
		}
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
	}
}