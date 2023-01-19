package ArrayEx;

import java.util.HashSet;
import java.util.Set;

public class ArrayEx1 {
	public static void main(String[] args) {
		String str = "abcdab";
		char[] chstr = str.toCharArray();
		Set dupChar = new HashSet<>();
		Set sameChar =new HashSet<>();
		for(char ch :chstr) {
			if(sameChar.add(ch)==false)
				dupChar.add(ch);
		}
		dupChar.forEach(ch->System.out.print(ch+ " "));
	}
}
