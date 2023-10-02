package streamfilter;

import java.util.stream.Collectors;

public class OccurrenceOfEachCharacterInStringWithoutSpace {
public static void main(String[] args) {
String str1 = "Chandra GK";
String str = str1.replaceAll("Chandra GK", "ChandraGK");
System.out.println(str.chars().mapToObj(x->(char)x).
collect(Collectors.groupingBy(i->i, Collectors.counting())));
	}
}
