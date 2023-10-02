package basics;

public class NumbersSumInString {

public static void main(String[] args) {
	String stringWithDigit = "1ab26xyz88www5";
	int sum = 0;
	for (int i = 0; i < stringWithDigit.length(); i++) {
		char ch = stringWithDigit.charAt(i);
		if (Character.isDigit(ch)) {
			int digit = Character.getNumericValue(ch);
			sum = sum + digit;
		}
	}
	System.out.println(sum);
 }
}
