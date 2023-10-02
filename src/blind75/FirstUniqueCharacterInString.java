package blind75;

//Given a string s, find the first 
//non-repeating character in it and return its index. If it does not exist, return -1.
public class FirstUniqueCharacterInString {
	public static void main(String[] args) {
		System.out.println(firstUniqChar("cchandra"));
	}

	private static int firstUniqChar(String str) {
		int[] freq = new int[26];
		char[] ch = str.toCharArray();
		for (char chars : ch) {
			freq[chars - 'a']++;
		}
		for (int i = 0; i < str.length(); i++) {
			if (freq[ch[i] - 'a'] == 1) {
				return i;
			}
		}
		return -1;
	}
}
