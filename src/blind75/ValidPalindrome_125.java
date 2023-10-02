package blind75;

public class ValidPalindrome_125 {

	public static void main(String[] args) {
		String str = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(str));
	}

	public static boolean isPalindrome(String str) {
		String actual = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		String rev = new StringBuffer(actual).reverse().toString();
		return actual.equals(rev);
	}
}
