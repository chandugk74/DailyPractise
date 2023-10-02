package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter a number");
			int x = sc.nextInt();

			System.out.println("enter another number");
			int y = sc.nextInt();

			System.out.println("the value of " + x + "/" + y + " is " + (x / y));
		} catch (InputMismatchException e) {
			System.out.println("entered wrong input");
		} catch (ArithmeticException e) {
			System.out.println("cannot devide by zerosr");
		} catch (Throwable e) {
			System.out.println("some other issue happened");
		}
	}
}
