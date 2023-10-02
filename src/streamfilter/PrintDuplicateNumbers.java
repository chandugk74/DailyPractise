package streamfilter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateNumbers {
public static void main(String[] args) {
List<Integer> list = Arrays.asList(1,1,2,3,3,5,5,6);
Set<Integer> newSet = new HashSet<>();
list.stream().filter(n->!newSet.add(n)).
forEach(System.out::println);
//System.out.println(list.stream().filter
//(n->!newSet.add(n)).collect(Collectors.toSet()));
	}
}