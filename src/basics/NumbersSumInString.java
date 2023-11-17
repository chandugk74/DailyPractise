package basics;

public class NumbersSumInString {
public static void main(String[] args) {
	String digit = "1ab26xyz88www5";
	int sum = 0;
for (int i = 0; i < digit.length(); i++) {
		char ch = digit.charAt(i);
		if (Character.isDigit(ch)) {
int num = Character.getNumericValue(ch);
			sum = sum + num;
		}
	}
	System.out.println(sum);
 }
}
