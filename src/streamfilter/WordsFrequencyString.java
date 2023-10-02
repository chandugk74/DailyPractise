package streamfilter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.sun.org.apache.xpath.internal.functions.Function;

public class WordsFrequencyString {
	public static void main(String[] args) {
List<String> wordsList = Arrays.asList("h", "h", "o");
//Count occurrences of each string in the list
Map<String, Long> countedResult = wordsList.stream()
.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
System.out.println(countedResult);
// Sort the result by count in descending order
countedResult.entrySet().stream().sorted((entry1, entry2) ->
entry2.getValue().compareTo(entry1.getValue()))
.forEach(entry -> System.out.println
		(entry.getKey() + ": " + entry.getValue()));
//		**********
String str="my name is java my name is";
String[] st= str.split(" ");
Map<String, Long> result = Arrays.asList(st).stream()
.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
System.out.println(result);
	}
}
