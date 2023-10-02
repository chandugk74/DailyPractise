package basics;

public class OccuringOnlyMaximumCharacter {
	public static void main(String[] args) {
		String str = "cbbbbbbbbbbbraaaa";
		int max = 0; // Initialize max count
		char result = ' '; // Initialize result
		int count[] = new int[256];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		System.out.println(result + " " + max);
	}
}
