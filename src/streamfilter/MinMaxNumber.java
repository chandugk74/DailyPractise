package streamfilter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MinMaxNumber {
	public static void main(String[] args) {

	    Integer maxNumber = Stream.of(7, 3, 14, 99, 222, 49, 100)
	        .max(Comparator.comparing(Integer::valueOf))
	        .get();
//	    List<Integer> maxNumber = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        int max =  maxNumber.stream().max(Integer::compare).get();
//	    System.out.println(max);

	    Integer minNumber = Stream.of(7, 3, 14, 99, 222, 49, 100)
	        .min(Comparator.comparing(Integer::valueOf)).get();
	    System.out.println("Max number in stream is "+ maxNumber);
	    System.out.println("Min number in stream is "+ minNumber);
	  }
}
