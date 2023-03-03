package basics;

import java.util.Set;
import java.util.TreeSet;

public class CommonCharacters {
	public static void main(String[] args) {
		String first = "abcbcd";
		String second = "cdefef";
		String common = commonCharacters(first, second);
		System.out.println(common);
	}
	public static String commonCharacters(String a, String b) {
		Set<Character> first = new TreeSet<>();
		Set<Character> second = new TreeSet<>();
		for (char c : a.toCharArray()) {
			first.add(c);
		}
		for (char c : b.toCharArray()) {
			second.add(c);
		}
		first.retainAll(second);
		return first.toString();
	}
}
