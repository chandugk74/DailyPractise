package blind75;

public class PalindromeString {
	public static void main(String[] args) {
		System.out.println(isPalindrome("ana"));
		System.out.println(isPalindrome("banana"));
	}
	static boolean isPalindrome(String str) {
		String rev=new StringBuilder(str).reverse().toString();
		return rev.equals(str);
	}
}
