package basics;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingInteger {
public static void main(String[] args) {
int[] nums = { 1, 2, 3, 4, 2, 3, 4 };
Map<Integer, Integer> countMap = new HashMap<>();
for (int num : nums) {
countMap.put(num, countMap.getOrDefault(num, 0) + 1);
	}
int nonRepeatingInteger = -1;
for (int num : nums) {
			if (countMap.get(num) == 1) {
				nonRepeatingInteger = num;
				break;
			}
		}
		if (nonRepeatingInteger != -1) {
			System.out.println(nonRepeatingInteger);
		} else {
System.out.println("No non-repeating integer found.");
		}
	}
}
