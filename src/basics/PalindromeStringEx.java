package basics;

import java.util.Scanner;

public class PalindromeStringEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an String");
		String str = sc.nextLine();
		String originalStr=str;
		String revStr="";
		
		for(int i=str.length()-1;i>=0;i--) {
			revStr=revStr+str.charAt(i);
		}
		if(originalStr.equals(revStr)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
	}
}
