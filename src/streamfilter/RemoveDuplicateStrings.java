package streamfilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateStrings {
public static void main(String[] args) {
List<String> list = Arrays.asList("A", "B", "B", "C");
List<String> distinctItems = 
list.stream().distinct().collect(Collectors.toList());
System.out.println(distinctItems);
	}
}
