package streamfilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateStrings {
public static void main(String[] args) {
//ArrayList<String> list =
//	new ArrayList<>(Arrays.asList("A", "A", "C"));
List<String> list = Arrays.asList("A", "B", "B", "C");
// Get list without duplicates
List<String> distinctItems = 
list.stream().distinct().collect(Collectors.toList());
// Let's verify distinct elements
System.out.println(distinctItems);
	}
}
