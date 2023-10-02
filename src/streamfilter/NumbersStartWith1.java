package streamfilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartWith1 {
public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(12,19,20,25,16);
ll.stream().map(s->s+"").filter(s->s.startsWith("1")).
forEach(System.out::println);
//***
ll.stream().filter(n->String.valueOf(n).startsWith("1")).
forEach(System.out::println);
	}
}
