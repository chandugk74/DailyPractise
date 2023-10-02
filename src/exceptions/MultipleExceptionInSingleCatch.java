package exceptions;

import java.util.Scanner;

public class MultipleExceptionInSingleCatch {

	public static void main(String[] args) {

		try {
			int a = 10 / 0;
			System.out.println("chandra".charAt(8));
			int[] b = new int[-2];

		} catch (ArithmeticException | StringIndexOutOfBoundsException | NegativeArraySizeException |NullPointerException ex) {
			ex.printStackTrace();
		}
	}

}
