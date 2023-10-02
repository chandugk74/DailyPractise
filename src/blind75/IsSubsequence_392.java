package blind75;

public class IsSubsequence_392 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "aghbfcr";
		System.out.println(isSequence(s1, s2));

	}

	public static boolean isSequence(String s1, String s2) {
		if (s1.length() == 0) {
			return false;
		}
		int i = 0;
		int j = 0;
		while (i < s1.length() && j < s2.length()) {
			if (s1.charAt(i) == s2.charAt(j)) {
				i++;
				j++;
			} else {
				j++;
			}
		}
		if (i == s1.length()) {
			return true;
		} else {
			return false;
		}
	}
}
//Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//A subsequence of a string is a new string that is formed from the original 
//string by deleting some (can be none) of the characters without disturbing the 
// relative positions of the remaining characters. 
//(i.e., "ace" is a subsequence of "abcde" while "aec" is not).
//Example 1:
//Input: s = "abc", t = "ahbgdc"
//Output: true
