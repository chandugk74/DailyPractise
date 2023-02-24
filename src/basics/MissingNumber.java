package basics;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 5 };
//		System.out.println(missingNumber(arr1));
//	}
//
//	public static int missingNumber(int[] arr1) {
		int n = arr1.length + 1;
		int sum = n * (n + 1) / 2;
		int restSum = 0;
		for (int i = 0; i < arr1.length; i++) {
			restSum += arr1[i];
		}
		int missingNumber = sum - restSum;
//		return missingNumber;
		System.out.println(missingNumber);
	}

}
