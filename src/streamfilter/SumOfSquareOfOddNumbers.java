package streamfilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfSquareOfOddNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
//		List<Integer> result = new ArrayList<Integer>();
		//sum of square of odd numbers
		int result=al.stream().filter(n->n%2!=0).map(n->n*n).reduce(0, Integer::sum);
		System.out.println(result);

		//sum of square of even numbers (2*2 + 4*4)
		int result1=al.stream().filter(n->n%2==0).map(n->n*n).reduce(0, Integer::sum);
		System.out.println(result1);

	}

}
