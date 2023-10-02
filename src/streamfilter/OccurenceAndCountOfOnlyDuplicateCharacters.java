package streamfilter;

import java.util.HashMap;
import java.util.Map;

public class OccurenceAndCountOfOnlyDuplicateCharacters {
public static void main(String args[]) {
String str = "test string";
Map<Character, Integer> count = new HashMap<>();
for (int i = 0; i < str.length(); i++) {
char ch=str.charAt(i);
if (count.containsKey(str.charAt(i)))
count.put(ch, count.get(ch) + 1);
else
count.put(ch, 1);
// increase the count of characters by 1
	}
for (Map.Entry<Character, Integer> mapElement : count.entrySet()) { 						// iterating through the unordered map
if (mapElement.getValue() > 1) 															// if the count of characters is greater than 1 then duplicate found
System.out.println(mapElement.getKey() +
		", count = " + mapElement.getValue());
		}
	}
}
