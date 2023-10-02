package blind75;

public class ValidAnagram_242 {

	public static void main(String[] args) {
		String s1 = "anagram";
		String s2 = "nagaram";
		System.out.println(isAnagramSort(s1, s2));
	}

	private static boolean isAnagramSort(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		int[] alphabet = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			alphabet[s1.charAt(i) - 'a']++;
//		}
//		for (int i = 0; i < s2.length(); i++) {
			alphabet[s2.charAt(i) - 'a']--;
		}
		for (int i=0;i<alphabet.length;i++) {
			if (alphabet[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
