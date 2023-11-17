package streamfilter;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortBasedOnLength {
public static void main(String[] args) {
List<String> listOfStrings =
Arrays.asList("C++", "COBOL", "C");
Collections.sort(listOfStrings, 
Comparator.comparing(s->s.length()));
System.out.println(listOfStrings);
//System.out.println(listOfStrings.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList()));

	}

}
