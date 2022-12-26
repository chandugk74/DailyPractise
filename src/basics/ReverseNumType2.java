package basics;

import java.util.Scanner;

public class ReverseNumType2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		using string buffer
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		
//		using string builder
//		StringBuilder sb1 = new StringBuilder();
//		sb1.append(num);
//		StringBuilder rev=sb1.reverse();
		System.out.println(rev);
	}
	}
