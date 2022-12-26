package basics;

import java.util.Scanner;

public class FactorialByScannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type any number...");
		int num = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
