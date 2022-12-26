package streamfilter;

import java.util.Collections;
import java.util.stream.Collectors;

public class OccurrenceOfEachCharacterInString1 {

	public static void main(String[] args) {
		String str = "Chandra G K";
		System.out.println(str.chars().
				mapToObj(x->(char)x).collect(Collectors
						.groupingBy(i->i, Collectors.counting())));
	}

}
