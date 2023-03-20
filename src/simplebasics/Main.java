package simplebasics;

import java.math.BigInteger;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		plusOne(array);
		System.out.println(Arrays.toString(array));
	}

	  public static int[] plusOne(int[] digits) {
	        int [] resultT;
	        String string ="";
	        for (int i:digits){
	            string+= i;
	        }
	        BigInteger result;
	        BigInteger bigInteger = new BigInteger(string);
	        result=bigInteger.add(new BigInteger("1"));
//	        System.out.println(result);
	        String string2 =result.toString();
//			System.out.println(string2);
			resultT=new int[string2.length()];
			for(int i=0;i<resultT.length;i++) {
				resultT[i]=string2.charAt(i)-'0';
			}
			return resultT;
	    }

}
