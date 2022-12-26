package basics;


public class ReverseStr {
	public static void main(String[] args) {
		String str = "Nalina";
		String rev = "";
		char a[] = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println(rev);
	}
}
