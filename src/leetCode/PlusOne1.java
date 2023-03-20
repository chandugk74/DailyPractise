package leetCode;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne1 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4 };
		int resultT[] = plusOne(array);
		System.out.println(Arrays.toString(resultT));
	}

	public static int[] plusOne(int[] digits) {
		int[] resultT;
		String string = "";
		for (int i : digits) {
			string += i;
		}
		BigInteger result;
		BigInteger bigInteger = new BigInteger(string);
		result = bigInteger.add(new BigInteger("1"));
		String string2 = result.toString();
		resultT = new int[string2.length()];
		for (int i = 0; i < resultT.length; i++) {
			resultT[i] = string2.charAt(i) - '0';
		}
		return resultT;
	}
}
