package streamfilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfArraySumofList {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.stream(nums).sum());
		System.out.println(IntStream.of(nums).sum());

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(list.stream().mapToInt(Integer::valueOf).sum());
		System.out.println(list.stream().reduce(Integer::sum).get().intValue());
	}
}
