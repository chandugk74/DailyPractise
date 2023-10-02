package streamfilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Dummy {
	public static void main(String[] args) {
		Integer[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int split=3;
		for(int i=0;i<=num.length;i+=split) {
			System.out.println(Arrays.toString(Arrays.copyOfRange(num, i, Math.min(num.length, i+=split))));
		}

	}
}
