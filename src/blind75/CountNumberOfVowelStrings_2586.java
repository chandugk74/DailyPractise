package blind75;

import java.util.HashMap;
import java.util.Map;

//check Vowel strings
public class CountNumberOfVowelStrings_2586 {
public static void main(String[] args) {
		String str = "chandra";
		char[] chr = str.toCharArray();
Map<Character, Integer> map = new HashMap<>();
	for (int i = 0; i < chr.length; i++) {
			char ch = str.charAt(i);
	if (ch == 'a' || ch == 'e' || ch == 'i' ||
	ch == 'o' || ch == 'u') {
	map.put(ch, map.getOrDefault(ch, 0) + 1);
				}
			}
	for (char c : map.keySet()) {
		int count = map.get(c);
	System.out.println(c + " " + count);
			}
	}
}
