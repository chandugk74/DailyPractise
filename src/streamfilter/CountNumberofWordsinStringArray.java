package streamfilter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.sun.org.apache.xpath.internal.functions.Function;

public class CountNumberofWordsinStringArray {

	public static void main(String[] args) {
		String[] array = { "n1", "n1", "n2", "n3", "n3", "n3", "n2" };
		Arrays.stream(array).collect(Collectors.groupingBy(s -> s))
				.forEach((k, v) -> System.out.println(k + " " + v.size()));
	}
}
