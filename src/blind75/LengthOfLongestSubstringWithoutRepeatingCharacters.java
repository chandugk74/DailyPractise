package blind75;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		String s="abcabca";
		int start = 0, end = 0, max = 0;
	    Set<Character> set = new HashSet<>();
	    while (end < s.length()) {
	        if (!set.contains(s.charAt(end))) {
	            set.add(s.charAt(end++));
	            max = Math.max(max, set.size());
	        } else {
	            set.remove(s.charAt(start++));
	        }
	    }
	    System.out.println(max);
	}
}
