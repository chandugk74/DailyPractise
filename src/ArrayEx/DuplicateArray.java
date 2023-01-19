package ArrayEx;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
		String str = "chandra";
		char[] charStr = str.toCharArray();
		Set dupChar = new HashSet<>();
		Set sameChar = new HashSet<>();
		for (char ch : charStr) {
			if(sameChar.add(ch)==false)
				dupChar.add(ch);
		}
		dupChar.forEach(ch->System.out.println(ch));
	}

}
