package basics;

public class FactorialEx {

	public static void main(String[] args) {
		int num = 5;//It is the number to calculate factorial 
		long factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.print(factorial);
	}
}
