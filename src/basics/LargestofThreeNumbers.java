package basics;

import java.util.Scanner;

public class LargestofThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		System.out.println("Enter Third Number");
		int c = sc.nextInt();
		if (a>b && a>c) {
			System.out.println(a + " is the greatest number");
		}else if (b>c&&b>a) {
			System.out.println(b + " is the greatest number");
		}else {
			System.out.println(c + " is the greatest number");
		}
	}
}
