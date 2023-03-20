package simplebasics;

public class Dummy1 {
	public static void main(String[] args) {
		String str ="abcdcjba";
		System.out.println(isPalindrome(str));
	}

	public static boolean isPalindrome(String str) {
//		String st = String.valueOf(x);
		int len = str.length();
		for (int i = 0; i <= len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
