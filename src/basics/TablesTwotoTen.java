package basics;

public class TablesTwotoTen {

	public static void main(String[] args) {
		int num = 10;
		for (int i = 1; i <= num; i++) {  //i refers to row
			for (int j = 1; j <= 5; j++) { //j refers to column
				System.out.printf("%4d", (i * j));
//				System.out.print(" "+ i*j);
			}
			System.out.println();
		}
	}

}
