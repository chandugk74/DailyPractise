package basics;

public class ReverseEachWord {
	public static void main(String[] args) {
		String str = "Name is Priyanka Doke";
		String strWords[] = str.split(" ");
		String rev = "";
		for (String st : strWords) {
			StringBuilder sb = new StringBuilder(st);
			sb.reverse();
			rev = rev + sb.toString() + " ";
		}
		System.out.println(rev.trim());
	}
}
