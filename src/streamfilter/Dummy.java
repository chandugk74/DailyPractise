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
		List<String> list = Arrays.asList("A", "B", "B", "C");
		List<Integer> list1 = Arrays.asList(1,1,2,3,3,5,5,6);
		Set<Integer> set= new HashSet<Integer>();
		list1.stream().filter(n->!set.add(n)).forEach(System.out::println);
	}
}
