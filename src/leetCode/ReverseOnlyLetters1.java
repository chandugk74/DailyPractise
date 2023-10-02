package leetCode;

public class ReverseOnlyLetters1 {

	public static void main(String[] args) {
		String str = "hdfgh^&*$#jjbdrs";
		StringBuilder sb = new StringBuilder();
		int j = str.length() - 1;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				while (!Character.isLetter(str.charAt(j))) {
					j--;
				}
				sb.append(str.charAt(j));
				j--;
			} else {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}
