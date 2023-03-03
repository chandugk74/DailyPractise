package basics;

import java.util.Arrays;

public class AnagramOfString {
	public static void main(String[] args) {
		String s1="race";
		String s2 = "acre";
		System.out.println(isAnagramSort(s1,s2));
	}
	static boolean isAnagramSort(String s1, String s2) {
	    if (s1.length() != s2.length()) {
	        return false;
	    }
//	    convert the above string to char array
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
//	    for case sensitive
//		char[] a1 = s1.toLowerCase().toCharArray();
//		char[] a2 = s2.toLowerCase().toCharArray();
	    Arrays.sort(a1);
	    Arrays.sort(a2);
	    return Arrays.equals(a1, a2);
	}
}
