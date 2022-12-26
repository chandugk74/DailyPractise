package streamfilter;

import java.util.Arrays;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] array = {545, 23, 92, 1, 200, 532};
		Arrays.stream(array).sorted().limit(array.length-1).skip(array.length-2).forEach(System.out::println);
	}

}
