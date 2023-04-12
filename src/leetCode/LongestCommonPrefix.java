package leetCode;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "floight" };
		System.out.println(longestCommonPrefix(strs));
	}
	private static String longestCommonPrefix(String[] strs) {
			String st = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(st) != 0) {
				st = st.substring(0, st.length() - 1);
			}
		}
		return st;
	}
}
