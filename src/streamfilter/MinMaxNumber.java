package streamfilter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MinMaxNumber {
	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(5,1,2,3,4,5,6);
	    Integer maxNumber = ll.stream().max(Comparator.comparing(Integer::valueOf)).get();
	    Integer minNumber = ll.stream().min(Comparator.comparing(Integer::valueOf)).get();
	    System.out.println("Max number in stream is "+ maxNumber);
	    System.out.println("Min number in stream is "+ minNumber);
	  }
}
