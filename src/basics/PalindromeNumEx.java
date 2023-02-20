package basics;

import java.util.Scanner;

public class PalindromeNumEx {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the number");
//		int num = sc.nextInt();
		int num = 12321;
		int OrignalNum = num;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		if (OrignalNum == rev) {
			System.out.println("number is palindrome");
		} else {
			System.out.println("number is not palindrome");
		}
	}
}
