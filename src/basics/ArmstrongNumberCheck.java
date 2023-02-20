package basics;

public class ArmstrongNumberCheck {

	public static void main(String[] args) {
		int n = 153;
		int remainder;
		int sum = 0;
		int temp = n;
		while(n>0) {
			remainder = n%10;
			sum = sum +(remainder*remainder*remainder);
			n =n/10;

		}
		if(sum==temp) {
			System.out.println(temp + " is Armstrong");
		}else {
			System.out.println(temp + " not armstrong");
		}
	}

}
