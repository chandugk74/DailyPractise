package leetCode;

import java.util.Arrays;

public class PlusOne {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		int[] digits = plusOne(array);
		System.out.println(Arrays.toString(digits));
	}

	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {//will increase last number if it is less than 9
				digits[i]++;
				return digits;
			}
			digits[i] = 0;//if last digit 9, then make 0
		}
		digits = new int[digits.length + 1];//if only one digit 9 is there, the increase the size of array to 2
											//By default the new array is [0,0]
		digits[0] = 1;//assign to 0th position to 1 and new array is [1,0];
		return digits;//return [1,0]
	}
}
