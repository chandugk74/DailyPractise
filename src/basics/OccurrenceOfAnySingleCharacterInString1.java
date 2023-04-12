package basics;

public class OccurrenceOfAnySingleCharacterInString1 {
	public static void main(String[] args) {
		String str = "my name is java";
		int orig_len = str.length();
		int final_len = str.replace("a", "").length();
		int count = orig_len - final_len;
		System.out.println(count);
	}
}
