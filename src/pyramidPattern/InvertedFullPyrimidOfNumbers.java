package pyramidPattern;

public class InvertedFullPyrimidOfNumbers {

	public static void main(String[] args) {
		int row = 5;
		for (int i = row; i >= 1; i--) {
			for (int j = row - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
