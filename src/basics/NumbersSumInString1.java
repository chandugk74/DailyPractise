package basics;

public class NumbersSumInString1 {
	public static void main(String[] args) {
		String str = "1ab26xyz88www5";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				sum = sum + (ch - '0');
			}
		}
		System.out.println("Sum of all digits " + sum);
		 
	}
}
