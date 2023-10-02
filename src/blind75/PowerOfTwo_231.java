package blind75;

public class PowerOfTwo_231 {
public static void main(String[] args) {
		System.out.println(isPowerofTwo(1));
		System.out.println(isPowerofTwo(16));
		System.out.println(isPowerofTwo(3));
	}
private static boolean isPowerofTwo(int num) {
//a power of two in binary form has and only has one "1"
//		return num>0 && Integer.bitCount(num) == 1;
		if (num == 0) {
			return false;
		}
		while (num != 1) {
			if (num % 2 != 0) {
				return false;
			} else {
				num = num / 2;
			}
		}
		return true;
	}
}

//Given an integer n, return true if it is a power of two. Otherwise, return false.
//An integer n is a power of two, if there exists an integer x such that n == 2x.
//
// 
//
//Example 1:
//
//Input: n = 1
//Output: true
//Explanation: 2^1 = 1
//Example 2:
//
//Input: n = 16
//Output: true
//Explanation: 2^4 = 16
//Example 3:
//
//Input: n = 3
//Output: false