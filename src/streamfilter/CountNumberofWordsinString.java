package streamfilter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.sun.org.apache.xpath.internal.functions.Function;

public class CountNumberofWordsinString {

	public static void main(String[] args) {
		String[] array = { "name1", "name2", "name3", "name3", "name3", "name2" };
		Arrays.stream(array).collect(Collectors.groupingBy(s -> s))
				.forEach((k, v) -> System.out.println(k + " " + v.size()));
		
	}

}
