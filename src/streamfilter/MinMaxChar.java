package streamfilter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MinMaxChar {
	public static void main(String[] args) {
//List<String> ll = Arrays.asList("abc", "def", "ghi");
 char minChar = Stream.of('f', 'k', 'b', 'j', 's', 'e', 'p')
.min(Comparator.comparing(Character::charValue)).get();
char maxChar = Stream.of('f', 'k', 'b', 'j', 's', 'e', 'p')
.max(Comparator.comparing(Character::charValue)).get();
System.out.println("Max char in Stream is " + maxChar);
System.out.println("Min char in stream is " + minChar);
	  }
}
