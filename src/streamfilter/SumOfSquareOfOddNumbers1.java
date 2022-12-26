package streamfilter;

import java.util.Arrays;

public class SumOfSquareOfOddNumbers1 {

	public static void main(String[] args) {
		Integer arr[] = {1,2,3,4};

		//		for odd numbers
		System.out.println(Arrays.asList(arr).stream().filter(x->x%2!=0).mapToInt(x->x*x).sum());
		
//		for even numbers
		System.out.println(Arrays.asList(arr).stream().filter(x->x%2==0).mapToInt(x->x*x).sum());

	}

}
