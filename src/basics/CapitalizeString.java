package basics;

public class CapitalizeString {
	public static void main(String[] args) {
		String str = "i love india";
		String[] st = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < st.length; i++) {
sb.append(Character.toUpperCase(st[i].charAt(0)))
.append(st[i].substring(1)).append(" ");
		}
		System.out.println(sb.toString());
	}
}
