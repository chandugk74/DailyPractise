package streamfilter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class SortandReverseSortArray {

	public static void main(String[] args) {
// Unsorted string array
String[] strArray = { "Alex", "Charles", "Dean", "Amanda", "Brian" };

// Sorting the strings
strArray = Stream.of(strArray).sorted().toArray(String[]::new);

// Sorted array
System.out.println("Sorted : " + Arrays.toString(strArray));

// Reverse sorting example
strArray = Stream.of(strArray).sorted(Comparator.reverseOrder())
		  .toArray(String[]::new);

// Reverse Sorted array
System.out.println("Reverse Sorted : " + Arrays.toString(strArray));
	}
}
