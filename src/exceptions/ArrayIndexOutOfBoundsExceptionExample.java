package exceptions;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("reached end of array");
		} catch (Exception e) {
			System.out.println("second hirarchey of exception");
		} catch (Throwable e) {
			System.out.println("super class of exception");
		}
	}

}
