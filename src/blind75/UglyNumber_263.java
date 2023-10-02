package blind75;

public class UglyNumber_263 {

	public static void main(String[] args) {
		System.out.println(isUglyNumber(6));
		System.out.println(isUglyNumber(14));

	}

	private static boolean isUglyNumber(int num) {
		if (num <= 0) {
			return false;
		}
		while (num != 0) {
			if (num % 2 == 0) {
				num = num / 2;
			} else if (num % 3 == 0) {
				num = num / 3;
			} else if (num % 5 == 0) {
				num = num / 5;
			} else {
				break;
			}
			if (num == 1) {
				return true;
			}
		}
		return false;
	}

}
