package basics;

public class PrimeNumberPrintingUpTo {
	
	public static void prime(int numb) {
		int total=0;
		for(int i=2;i<=numb;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				total++;
				System.out.print(i +" ");
			}
		}
		System.out.println( total);
	}
	

	public static void main(String[] args) {
		PrimeNumberPrintingUpTo.prime(100);
	}
}
