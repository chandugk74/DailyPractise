package blind75;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {
		String s1 = "anagram";
		String s2 = "nagaram";
		System.out.println(isAnagramSort(s1, s2));
	}

	private static boolean isAnagramSort(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
	}

}
