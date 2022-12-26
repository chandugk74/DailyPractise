package streamfilter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(1,1,5,6,6,9,9,12,10,10);
		Set<Integer> ss = new HashSet<>();
		ll.stream().filter(n->!ss.add(n)).forEach(System.out::println);
	}
}
