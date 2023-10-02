package blind75;

public class PrefixOfAnyWord_1455 {
	public static int checkPrefix(String sentence, String searchWord) {
		String[] sentences = sentence.split(" ");
		for (int i = 0; i < sentences.length; i++) {
			if (sentences[i].startsWith(searchWord)) {
				return i + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String sentence = "i love India";
		String searchWord = "Ind";
		System.out.println(checkPrefix(sentence, searchWord));
	}

}
