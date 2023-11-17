package streamfilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStringList {
public static void main(String[] args) {
List<String> stringList = 
Arrays.asList("A", "D", "B", "E", "C");
List<String> reversedStringList =
stringList.stream().sorted((a, b) -> -1)
.collect(Collectors.toList());
System.out.println(reversedStringList);
	}
}
