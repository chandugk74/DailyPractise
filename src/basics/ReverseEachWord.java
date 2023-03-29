package basics;

public class ReverseEachWord {
	public static void main(String[] args) {
		String str = "My name is jitendra";
		String strWords[] = str.split(" ");
		String rev = "";
		for (String st : strWords) {
			StringBuilder sb = new StringBuilder(st);
			sb.reverse();
//			rev+ = sb.toString() + " ";
			rev = rev + sb.toString() + " ";
		}
		System.out.println("The modified string is :" + rev.trim());
//			System.out.println("The modified string is :" + rev);
	}
}
