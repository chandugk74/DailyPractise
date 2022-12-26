package ArrayEx;

public class Dummy {

	public static void main(String[] args) {
//		Declare an integer
		int num = 12345678;
		System.out.println("the given integer = " + num);
//		declare even and odd count zero to store each even and odd digits
		int even_count = 0;
		int odd_count = 0;
//		while number > 0
		while (num > 0) {
//			declare the remainder to check even and odd digits, if even store in even_count else in odd_count
			int remainder = num % 10;
			if (remainder % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
//				iterate again by dividing in 10
			num = num / 10;
		}
		System.out.println("number of even digits = " + even_count);
		System.out.println("number of odd digits = " + odd_count);

	}

}
