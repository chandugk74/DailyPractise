package simplebasics;

public class FactorialOfNumberWhileLoop {
	public static void main(String[] args) {
		int num=5;
		int i=1,factorial=1;
		while(i<=num) {
			factorial = factorial*i;
			i++;
		}
		System.out.println(factorial);
	}

}
