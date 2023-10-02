package basics;

public class MissingCharacterInSecondString {

	public static void main(String[] args) {
		String first = "abc";
		String second = "ac";
		int sum = 0;
		for (char ch : first.toCharArray()) {
			sum += ch;
		}
		for (char ch : second.toCharArray()) {
			sum -= ch;
		}
		System.out.println((char) sum);
	}
}
