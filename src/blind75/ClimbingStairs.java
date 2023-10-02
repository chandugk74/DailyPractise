package blind75;

public class ClimbingStairs {
	public static void main(String[] args) {
		System.out.println(climbStair(5));
	}
	public static int climbStair(int num) {
		if (num <= 3) {
			return num;
		}
		int a = 3, b = 2;
		for (int i = 0; i < num - 3; i++) {
			a = a + b;
			b = a - b;
		}
		return a;
	}
}
