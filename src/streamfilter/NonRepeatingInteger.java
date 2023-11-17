package streamfilter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingInteger {
public static int findNonRepeating(int[] nums) {
List<Integer> numList = Arrays.stream(nums).boxed().
collect(Collectors.toList());
Map<Integer, Long> countMap = numList.stream()
.collect(Collectors.groupingBy(Function.identity(),
		Collectors.counting()));
return numList.stream().filter(num -> countMap.get(num) == 1)
.findFirst().orElse(-1); 
    }
public static void main(String[] args) {
int[] nums = { 2, 3, 5, 3, 2, 6, 1, 5 };
int result = findNonRepeating(nums);
 System.out.println(result); // Output: 6
    }
}
