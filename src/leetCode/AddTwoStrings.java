package leetCode;

public class AddTwoStrings {
public static void main(String[] args) {
String num1 = "123";
String num2 = "123";
String result = "";
int i = num1.length() - 1;
int j = num2.length() - 1;
int carry = 0;
while (i >= 0 || j >= 0 || carry != 0) {
int ivalue = i >= 0 ? num1.charAt(i) - '0' : 0;
int jvalue = j >= 0 ? num1.charAt(j) - '0' : 0;
			i--;
			j--;
int sum = ivalue + jvalue + carry;
result = (sum % 10) + result;
carry = sum / 10;
		}
System.out.println(result);
	}
}
