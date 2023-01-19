package simplebasics;

public class ArmstrongNumberCheck {

	public static void main(String[] args) {
		int n = 153;
		int remainder;
		int sum = 0;
		int temp = n;
		while(n>0) {
			remainder = n%10;
			n =n/10;
			sum = sum +(remainder*remainder*remainder);
		}
		if(sum==temp) {
			System.out.println("is Armstrong");
		}else {
			System.out.println("not armstrong");
		}
	}

}
