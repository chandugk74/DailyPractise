package basics;

public class COuntSumofDigits {
	public static void main(String[] args) {
		int num = 123456;
		int sum =0;
		while(num>0) {
			sum = sum+num%10;
			num = num/10;
		}
		System.out.println("sum of the num is " + sum);
	}
}
