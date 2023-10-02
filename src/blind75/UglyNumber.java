package blind75;

public class UglyNumber {

	public static void main(String[] args) {
		System.out.println(isUglyNumber(6));
		System.out.println(isUglyNumber(14));
	}

	private static boolean isUglyNumber(int num) {
		if(num<=0) {
			return false;
		}
		int[] divisible= {2,3,5};
		for(int numbers:divisible) {
			while(num%numbers==0) {
				num=num/numbers;
			}
		}
		return num==1;
	}

}
