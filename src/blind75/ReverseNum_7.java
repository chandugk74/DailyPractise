package blind75;

public class ReverseNum_7 {
	public static void main(String[] args) {
		int num=-123;
		System.out.println(reverseNum(num));
	}
	public static int reverseNum(int num) {
			int rev=0;
			while(num!=0) {
				int digit=num%10;
				rev=(rev*10)+digit;
				num=num/10;
			}
			return rev;
		}
	}


