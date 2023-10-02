package blind75;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr1 = {9,6,4,2,3,5,7,0,1};
		int n = arr1.length + 1;
		int sum = n * (n + 1) / 2;
		int restSum = 0;
		for (int i = 0; i < arr1.length; i++) {
			restSum += arr1[i];
		}
		int missingNumber = sum - restSum;
		System.out.println(missingNumber);
	}

}
