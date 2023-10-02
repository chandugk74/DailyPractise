package leetCode;

public class ReverseWordsString {
	public static void main(String[] args) {
		String str="Name is Priyanka Doke";
		String[] st =str.split(" +");
		StringBuilder sb = new StringBuilder();
		for (int i = st.length-1; i >=0; i--) {
			sb.append(st[i]+" ");
//			sb.append(" ");
		}
		System.out.println(sb.toString().trim());
	}
}
