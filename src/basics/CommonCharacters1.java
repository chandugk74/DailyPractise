package basics;

import java.util.HashSet;
import java.util.Set;

public class CommonCharacters1 {
public static void main(String[] args) {
		String first = "abcbcd";
		String second = "cdefef";
Set<Character> set = new HashSet<>();
for (int i = 0; i < first.length(); i++) {
for (int j = 0; j < second.length(); j++) {
if (first.charAt(i) == second.charAt(j)) {
			set.add(first.charAt(i));
				}
			}
		}
	System.out.println(set);
	}
}
