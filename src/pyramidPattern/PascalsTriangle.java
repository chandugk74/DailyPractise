package pyramidPattern;

public class PascalsTriangle {
public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
	for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}
			int number = 1;
			for (int k = 1; k <= i; k++) {
		System.out.print(number + " ");
			number = number * (i - k) / k;
			}
			System.out.println();
		}
	}
}