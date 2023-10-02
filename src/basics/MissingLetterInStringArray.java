package basics;

import java.util.Arrays;

public class MissingLetterInStringArray {

	public static void main(String[] args) {
		String[] str_arra = {"A", "B", "D", "E"};
	    String result = test(str_arra);
	    System.out.printf(result);
	  }
	  public static String test(String[] str_arra) {
	   for (int i = 0; i < str_arra.length-1; i++) {
		if (str_arra[i+1].charAt(0) - str_arra[i].charAt(0) > 1) {
		String result_char = "" +	(char)((int)str_arra[i].charAt(0)+1);
		return result_char;
			}
	   }
	return "";
	}
}
