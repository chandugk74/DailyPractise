package blind75;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubstringWithoutRepeatingCharacters_3 {
public static void main(String[] args) {
		String str="abcabcab";
		int start=0;
		int end=0;
		int max_length=0;
		List<Character> list = new ArrayList<Character>();
		while(end<str.length()) {
			if(!list.contains(str.charAt(end))) {
				list.add(str.charAt(end));
				end++;
				max_length=Math.max(max_length, list.size());
			}else {
				list.remove(Character.valueOf(str.charAt(start)));
				start++;
			}
		}
		System.out.println(max_length);
	}
}
