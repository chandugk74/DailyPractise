package streamfilter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {

public static void main(String[] args) {
int[] array = {5, 9, 11, 22, 8, 21, 1};
System.out.println(Arrays.stream(array).boxed().sorted(Comparator
		.reverseOrder()).limit(2).skip(1).findFirst().get());
//*********List**************
List<Integer> numbers = Arrays.asList(5, 9, 11, 22, 8, 21, 1);
System.out.println(numbers.stream().sorted(Comparator.
		           reverseOrder()).skip(1).findFirst().get());
		}
}