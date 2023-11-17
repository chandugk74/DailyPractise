package basics;

import java.util.HashMap;

public class OccurrenceOfEachCharacterInString {
public static void main(String[] args) {
String str = "chandrashekara G K";
HashMap<Character, Integer> duplicates
= new HashMap<>();
for (int i = 0; i < str.length(); i++) {
		Character ch = str.charAt(i);
		if (duplicates.containsKey(ch)) {
		int count = duplicates.get(ch);
			duplicates.put(ch, count+1);
			} else {
				duplicates.put(ch, 1);
			}
		}
		System.out.println(duplicates);
	}
}

//1. Create a HashMap which will contain character to count mapping.
//2. Iterate over String
//3. make count to 1 if HashMap do not contain the character and put 
//	 it in HashMap with key as Character and count as value
//4. If HashMap already have the character, increment its count by 1
