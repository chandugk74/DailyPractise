package blind75;

public class ReverseVowelsOfString1 {
	public static void main(String[] args) {
		System.out.println(reverseVowels("hello"));
	}
	private static String reverseVowels(String str) {
		String vowels = "aeiouAEIOU";
		char[] chars = str.toCharArray();
		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
while (start < end && !vowels.contains(chars[start] + "")) {
				start++;
			}
while (start < end && !vowels.contains(chars[end] + "")) {
				end--;
			}
			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;
			start++;
			end--;
		}
		return new String(chars);
	}
}
