package blind75;

import java.util.Arrays;

public class TwoSum_1 {
public static void main(String[] args) {
		int[] array = {  3, 3 };
		int target = 6;
	int result[] = twoSum(array, target);
System.out.println(Arrays.toString(result));
	}
public static int[] twoSum
			(int[] num, int target) {
for (int i = 0; i < num.length; i++) {
	for (int j = i + 1; j < num.length; j++) {
				int compliment = target-num[i];
				if (num[j] == compliment) {
					return new int[] { i, j };
				}
			}
		}
throw new IllegalArgumentException("not found");
	}
}
