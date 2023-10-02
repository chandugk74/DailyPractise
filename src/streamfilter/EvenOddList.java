package streamfilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddList {
	public static void main(String[] args) {
List<Integer> al = 
Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
al.stream().filter(n -> n % 2 == 0).
forEach(System.out::print);
//ArrayList<Integer> al = 
//new ArrayList<>(Arrays.asList(10,2,15,40,45));
System.out.println(al.stream().filter(n->n%2==0)
				.collect(Collectors.toList()));
System.out.println(al.stream().filter(n->n%2 !=0)
				.collect(Collectors.toList()));
System.out.println(al.stream().filter(n->n%5 ==0)
				.collect(Collectors.toSet()));
	}
}
