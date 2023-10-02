package blind75;

import java.util.HashMap;

public class WordPattern1 {

	public static void main(String[] args) {
		String pattern = "abab";
		String str = "apple bag apple bag";
		System.out.println(wordPattern(pattern, str));
	}

	private static boolean wordPattern(String pattern, String str) {
		String[] st = str.split(" ");
		if (pattern.length() != st.length) {
			return false;
		}
		HashMap<Character, String> hm = new HashMap<Character, String>();
		for (int i = 0; i < pattern.length(); i++) {
			char ch = pattern.charAt(i);
			boolean containKey = hm.containsKey(ch);
			if (hm.containsValue(st[i]) && !containKey) {
				return false;
			}
			if (containKey && !hm.get(ch).equals(st[i])) {
				return false;
			} else {
				hm.put(ch, st[i]);
			}
		}
		return true;
	}

}
