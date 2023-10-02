package blind75;

public class PowerOfTwo {
	public static void main(String[] args) {
		System.out.println(isPowerofTwo(1));
		System.out.println(isPowerofTwo(16));
		System.out.println(isPowerofTwo(3));
	}
	private static boolean isPowerofTwo(int n) {
		if (n == 1) {
			return true;
		}
		if (n == 0) {
			return false;
		}
		if (n % 2 != 0) {
			return false;
		} else {
			return isPowerofTwo(n / 2);
		}
	}
}
