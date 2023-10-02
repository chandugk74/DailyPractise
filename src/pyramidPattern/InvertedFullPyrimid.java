package pyramidPattern;

public class InvertedFullPyrimid {
public static void main(String[] args) {
		int row = 6;
		for (int i = row; i >= 1; i--) {
	for (int j = row - i; j >= 1; j--) {
				System.out.print(" ");
			}
for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
