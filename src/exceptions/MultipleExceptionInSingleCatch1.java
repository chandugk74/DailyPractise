package exceptions;

import java.util.Arrays;

public class MultipleExceptionInSingleCatch1 {

	public static void main(String[] args) {
		try {
		int[] arr= new int[10];
		System.out.println(Arrays.toString(arr));
//		arr[10]=10/0;
		arr[10]=10/2;//the exception message will appear from line right to left
		arr[10]=10/0;

		}catch(ArithmeticException|ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
