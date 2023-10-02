package blind75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConcatenatedWords_472 {
	public static void main(String[] args) {
	String[] wordsArray = { "cat", "dog", "catdog" };
		Set<String> wordsSet = new HashSet<>();
		for (String word : wordsArray) {
			wordsSet.add(word);
		}
		for (String word : wordsArray) {
			if (isConcatenatedWord(word, wordsSet)) {
				System.out.println(word);
			}
		}
	}
	public static boolean isConcatenatedWord(String word, Set<String> wordsSet) {
		for (int i = 1; i < word.length(); i++) {
			String prefix = word.substring(0, i);
			String suffix = word.substring(i);

if (wordsSet.contains(prefix) && (wordsSet.contains(suffix) 
		|| isConcatenatedWord(suffix, wordsSet))) {
				return true;
			}
		}
		return false;
	}
}
