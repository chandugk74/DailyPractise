package leetCode;

public class ReverseWordsString1 {

	public static void main(String[] args) {
		String str="Name is Rojalin Dalai";
		String[] st = str.split(" ");
		String rev = "";
		for (int i = 0; i < st.length; i++) {
			rev = st[i] + " " + rev;
		}
		System.out.println(rev);
	}
}
