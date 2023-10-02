package blind75;

public class ReverseWordsInString_151 {
public static void main(String[] args) {
System.out.println(reverseWord("i am java"));
	}
public static String reverseWord(String str) {
		String[] st = str.split(" +");
		StringBuilder sb = new StringBuilder();
		for (int i = st.length - 1; i >= 0; i--) {
			sb.append(st[i]);
			sb.append(" ");
		}
		return sb.toString().trim();
	}
}
