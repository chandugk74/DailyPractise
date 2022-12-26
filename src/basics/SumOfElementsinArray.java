package basics;

public class SumOfElementsinArray {
	public static void main(String[] args) {
		int a[] = { 1, 1, 5, 6, 7, 9, 12, 45 };
		int sum = 0;
//		for(int i =0; i<=a.length-1;i++) {
//			sum=sum+a[i];
//	}
		// Enhanced for loop

		for (int value : a) {
			sum = sum + value;
		}
		System.out.println(sum);
	}
}
