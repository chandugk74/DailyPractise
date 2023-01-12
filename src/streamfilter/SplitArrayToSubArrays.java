package streamfilter;

import java.util.*;
import java.util.stream.*;

public class SplitArrayToSubArrays {

	public static void main(String args[]) {
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int subArray = 3;

		int[][] output = splitArray(intArray, subArray);
		for (int[] x : output)
			System.out.println(Arrays.toString(x));
	}

	public static int[][] splitArray(int[] intArray, int subArray) {
		return IntStream.iterate(0, i -> i + subArray).limit((int) Math.ceil((double) intArray
				.length / subArray)).mapToObj(j -> Arrays.copyOfRange(intArray, j,
				Math.min(intArray.length, j + subArray))).toArray(int[][]::new);
	}
}