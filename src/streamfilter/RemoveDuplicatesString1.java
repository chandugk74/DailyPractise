package streamfilter;

import java.util.stream.Collectors;

public class RemoveDuplicatesString1 {
public static void main(String[] args) {
String str = "aabcddef";
System.out.println(str.chars().distinct().
mapToObj(ch -> String.valueOf((char) ch)).
collect(Collectors.joining()));
	}
}
