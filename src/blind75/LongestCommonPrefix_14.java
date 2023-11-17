package blind75;

public class LongestCommonPrefix_14 {
public static void main(String[] args) {
String[] strs = { "flower", "flow", "flight" };
System.out.println(prefix(strs));
	}
private static String prefix(String[] strs) {
		String st = strs[0];
	for (int i = 1; i < strs.length; i++) {
		while (strs[i].indexOf(st) != 0) {
	st = st.substring(0, st.length() - 1);
			}
		}
		return st;
	}
}
