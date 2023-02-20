package streamfilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNumbers {
	public static void main(String[] args) {
		// ArrayList with duplicate elements
		List<Integer> numbersList = Arrays.asList(1, 2, 2, 3, 3, 3);
//		Map<Integer, Long> elementCountMap = numbersList.stream()
//		.collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
//		 	System.out.println(elementCountMap);
		numbersList.stream().collect(Collectors.groupingBy(s -> s))
		.forEach((k, v) -> System.out.println(k + " " + v.size())); 	
		 	
	}
}
