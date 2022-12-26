package basics;

public class FibbEx {
//0 1 1 2 3 5 8 13 21 34
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, sum = 0;
		System.out.print(n1 + " " + n2);
		for (int i = 2; i <= 15; i++) { // iterate start from 2, bcoz 0&1 printed above, i<=10 means to get up to 10
										// fibonacci numbers
			sum = n1 + n2; // 1=0+1
			System.out.print(" " + sum); // 1
			n1 = n2; // assign n2 value to n1
			n2 = sum; // assign sum value to n2
		}
	}
}
