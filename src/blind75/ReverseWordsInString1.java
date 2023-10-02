package blind75;

public class ReverseWordsInString1 {
	public static void main(String[] args) {
System.out.println(reverseWords("i am java"));
	}
private static String reverseWords(String str) {
		String[] st = str.split(" +");
		String rev = "";
		for (int i = 0; i < st.length; i++) {
			rev = st[i] + " " + rev;
		}
		return rev;
	}
}
