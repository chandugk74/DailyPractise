package basics;

public class CountNumberofWordsinString {
	public static void main(String[] args) {
		String st = "my name is chandru";
		int count = 1;
		for (int i = 0; i < st.length(); i++) {
			if ((st.charAt(i) == ' ') && (st.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println(count);
	}
}
