package blind75;

public class ValidPalindrome {

	public static void main(String[] args) {
		String str = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(str));
	}

	private static boolean isPalindrome(String str) {
		String actual = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		int start=0;
		int end=actual.length()-1;
		while(start<=end) {
			if(actual.charAt(start)!=actual.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
