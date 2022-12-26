package streamfilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddList {

	public static void main(String[] args) {
//		List<Integer> al = Arrays.asList(10,20,15,25,30);
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10,2,15,40,45));
		System.out.println("the even numbers are = "+ al.stream().filter(n->n%2==0).collect(Collectors.toList()));
		System.out.println("the odd numbers are = " + al.stream().filter(n->n%2 !=0).collect(Collectors.toList()));

		
//		al.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
//		al.stream().filter(n->n%2 !=0).forEach(n->System.out.println(n));
	}
}
