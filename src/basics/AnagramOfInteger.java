package basics;

import java.util.Arrays;

public class AnagramOfInteger {
	public static void main(String[] args) {
		int num = 123;
		int num2 = 213;
		System.out.println(isAnagram(num, num2));
	}

	public static boolean isAnagram(int num, int num2) {
		char[] c1 = String.valueOf(num).toCharArray();
		char[] c2 = String.valueOf(num2).toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
	}
}
