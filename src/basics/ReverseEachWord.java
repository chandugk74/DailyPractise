package basics;

public class ReverseEachWord {

	public static void main(String[] args) {

			String str = "My name is chandu";
			System.out.println("The original String is :" + str);
			String strWords[] = str.split(" ");
			String rev = "";
			for (String st : strWords) {
			StringBuilder sb = new StringBuilder(st);
			sb.reverse();
			rev= rev + sb.toString() + " ";
//			rev+ = sb.toString() + " ";

				}
			System.out.println("The modified string is :" + rev.trim());
//			System.out.println("The modified string is :" + rev);
	}
}
