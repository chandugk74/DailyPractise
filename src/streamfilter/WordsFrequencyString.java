package streamfilter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.sun.org.apache.xpath.internal.functions.Function;

public class WordsFrequencyString {

	public static void main(String[] args) {
		List <String> wordsList = Arrays.asList("hello", "bye", "ciao", "bye", "ciao");
		Map<String, Integer> counts = wordsList.parallelStream().
	            collect(Collectors.toConcurrentMap(
	                w -> w, w -> 1, Integer::sum));
	        System.out.println(counts);
	}

}
