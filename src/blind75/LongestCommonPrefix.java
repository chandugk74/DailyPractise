package blind75;

import java.util.Arrays;

public class LongestCommonPrefix {
public static void main(String[] args) {
String[] str = { "cha", "chand",
		"chandr", "chandra" };
System.out.println(longestPrefix(str));
	}
private static String longestPrefix(String[] str) {
		Arrays.sort(str);
		int index = 0;
		String start = str[0];
		String end = str[str.length - 1];
while (index < start.length() && 
		index < end.length()) {
if (start.charAt(index) == end.charAt(index)) {
				index++;
			} else {
				break;
			}
		}
		return start.substring(0, index);
	}
}
