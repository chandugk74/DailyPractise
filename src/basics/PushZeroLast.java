package basics;

import java.io.*;
import java.util.Arrays;

class PushZeroLast {
public static void main(String[] args) {
int arr[] = { 0,1, 0, 2, 3, 0, 0, 0, 2 };
int newArray[] = new int[arr.length];
		int count = 0;
		for (int num : arr) {
			if (num != 0) {
				newArray[count++] = num;
			}
		}
System.out.println(Arrays.toString(newArray));
	}
}