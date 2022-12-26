package streamfilter;

import java.util.Comparator;
import java.util.stream.Stream;

public class MinMaxChar {
	public static void main(String[] args) {
	    char minChar = Stream.of('f', 'k', 'b', 'j', 's', 'e', 'p')
	        .min(Comparator.comparing(Character::charValue)).get();

	    char maxChar = Stream.of('f', 'k', 'b', 'j', 's', 'e', 'p')
	        .max(Comparator.comparing(Character::charValue)).get();
	    System.out.println("Max char in Stream is " + maxChar);
	    System.out.println("Min char in stream is " + minChar);
	  }
}
