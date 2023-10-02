package blind75;

public class PalindromeInteger_9 {
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}
	static boolean isPalindrome(int num) {
		int temp = num;
		int rev = 0;
		while (num > 0) {
			int digit = num % 10;
			rev = (rev * 10) + digit;
			num = num / 10;
		}
		if (rev == temp) {
			return true;
		} else {
			return false;
		}
	}
}
