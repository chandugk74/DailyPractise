package leetCode;

import java.util.Arrays;
import sun.security.util.Length;

public class LongestCommonPrefix1 {

	public static void main(String[] args) {
		String[] str = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(str));
	}

	private static String longestCommonPrefix(String[] str) {
		if (str == null || str.length == 0)
            return "";
		Arrays.sort(str);
		String str1 = str[0];
		String str2 = str[str.length - 1];
		int index = 0;
		while (index < str1.length()) {
			if (str1.charAt(index) == str2.charAt(index)) {
				index++;
			} else {
				break;
			}
		}
		return index == 0 ? "" : str1.substring(0, index);

	}
}
