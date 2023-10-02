package streamfilter;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumber {
public static void main(String[] args) {
int[] arr = { 4, 7, 8, 9, 1, 5, 2, 3 };
Set<Integer> arrNum = Arrays.stream(arr).boxed().
							 collect(Collectors.toSet());
int min = Arrays.stream(arr).min().orElse(0);
int max = Arrays.stream(arr).max().orElse(0);
IntStream.rangeClosed(min, max).filter(num -> 
!arrNum.contains(num)).forEach(num -> System.out.print(num + " "));
	}
}
