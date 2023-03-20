package basics;

public class OccurenceOfMaxCharacters {
	public static void main(String[] args) {
		String str = "chandra is learing";
		char string[] = str.toCharArray();
		int[] frequency = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					frequency[i]++;
				}
			}
		}
		int max = 0;
		char maxChar = 0;

		for (int i = 0; i < frequency.length; i++) {
			if (max < frequency[i]) {
				max = frequency[i];
				maxChar = string[i];
			}
		}
		System.out.println(maxChar + " " + max);
	}
}
