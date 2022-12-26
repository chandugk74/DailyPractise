package streamfilter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CountDuplicateNumbers_1 {

	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,1,2,3,3,4,5);
	Set<Integer> result = findDupNo(list);
	result.forEach(System.out::println);
	
	}
	public static <T> Set<T> findDupNo(List<T> list){
		Set<T> abc = new HashSet<>();
		return list.stream().filter(n->!abc.add(n)).collect(Collectors.toSet());
	}

}