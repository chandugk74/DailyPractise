package streamfilter;

import java.util.HashSet;
import java.util.Set;

public class OccurenceOfOnlyDuplicateCharacters {
	public static void main(String[] args) {
		String input = "cccbbbddaa";
		char[] chInput = input.toCharArray();
		Set setDuplicated = new HashSet<>();
		Set distinctChars = new HashSet<>();
		for (char ch : chInput) {
			if (distinctChars.add(ch) == false)
				setDuplicated.add(ch);
		}
		System.out.println(setDuplicated);
setDuplicated.forEach(ch -> System.out.print(ch + ","));
	}
}
