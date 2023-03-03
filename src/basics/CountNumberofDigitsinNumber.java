package basics;

public class CountNumberofDigitsinNumber {
	public static void main(String[] args) {
		int num = 325936;
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println( count);
	}
}
