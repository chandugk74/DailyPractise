package abstractClass;

import java.util.HashSet;
import java.util.Set;

public class Dummy {
	public static void main(String[] args) {
		String[] words = { "cat", "dog", "catdog", "dogcat", "bird", "catdogbird", "cat" };
		Set<String> set = new HashSet<String>();
		for (String word : words) {
			set.add(word);
		}
		for (String word : words) {
			if (isConcatinae(word, set)) {
				System.out.println(set);
			}
		}

	}

	public static boolean isConcatinae(String word, Set<String> set) {
		for (int i = 1; i < word.length(); i++) {
			String prefix = word.substring(0, i);
			String suffix = word.substring(1);
			if (set.contains(prefix) && set.contains(suffix) || isConcatinae(suffix, set)) {
				return true;
			}
		}
		return false;
	}
}

