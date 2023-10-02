package blind75;

//check Vowel strings
public class CountNumberOfVowelStrings_2586 {

	public static void main(String[] args) {
		String[] str = { "aie", "amy", "u" };
		int left = 0;
		int right = str.length-1;
		System.out.println(vowelsString(str, left, right));
	}

	private static int vowelsString(String[] str, int left, int right) {
		int count = 0;
		for (int i = left; i <= right; i++) {
			int start = str[i].charAt(0);
			int end = str[i].charAt(str[i].length() - 1);
			if (start == 'a' || start == 'e' || start == 'i' || start == 'o' || start == 'u') {
				if (end == 'a' || end == 'e' || end == 'i' || end == 'o' || end == 'u') {
					count++;
				}
			}
		}
		return count;
	}

}
