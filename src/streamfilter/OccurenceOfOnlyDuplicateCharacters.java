package streamfilter;

import java.util.HashSet;
import java.util.Set;

public class OccurenceOfOnlyDuplicateCharacters {
	public static void main(String[] args) {
		String input = "Chandrashekara";
		char[] chInput = input.toCharArray();
		Set setDuplicated = new HashSet<>();
		Set distinctChars = new HashSet<>();

		for (char ch : chInput) {
			if (distinctChars.add(ch) == false)
// if character is duplicated, then insert it into duplicated set
				setDuplicated.add(ch);
		}
		// print duplicated characters
		System.out.print("Duplicate characters are: ");
		setDuplicated.forEach(ch -> System.out.print(ch + ","));

	}
}
