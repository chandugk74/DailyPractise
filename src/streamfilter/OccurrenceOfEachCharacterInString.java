package streamfilter;

import java.util.HashMap;

public class OccurrenceOfEachCharacterInString {

	public static void main(String[] args) {
//		Using HashMap’s computeIfPresent and computeIfAbsent
		String str = "nalina";
		HashMap<Character, Integer> charFreqMap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			charFreqMap.computeIfPresent(ch, (character, count) -> count + 1);
			charFreqMap.computeIfAbsent(ch, (character) -> 1);
		}
		System.out.println(charFreqMap);
	}
}
