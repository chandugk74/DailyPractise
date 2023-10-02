package blind75;

import java.util.HashMap;
import java.util.Map;

public class WordPattern_290 {
	public static void main(String[] args) {
		String pattern="abab";
		String str="apple bag apple bag";
		System.out.println(wordPattern(pattern, str));
	}
	public static boolean wordPattern(String pattern, String str) {
		String[] words = str.split(" ");
		if (words.length != pattern.length())
			return false;
		Map map = new HashMap();
		for (Integer i = 0; i < words.length; ++i)
			if (map.put(pattern.charAt(i), i) != map.put(words[i], i))
				return false;
		return true;
	}

}
