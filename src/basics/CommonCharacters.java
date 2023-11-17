package basics;

import java.util.Set;
import java.util.TreeSet;

public class CommonCharacters {
public static void main(String[] args) {
		String first = "abcbcd";
		String second = "cdefef";
Set<Character> s1 = new TreeSet<>();
Set<Character> s2 = new TreeSet<>();
for (char c : first.toCharArray()) {
			s1.add(c);
	}
for (char c : second.toCharArray()) {
			s2.add(c);
	}
s1.retainAll(s2);
System.out.println(s1.toString());
	}
}
