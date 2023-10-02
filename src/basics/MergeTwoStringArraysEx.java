package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoStringArraysEx {
	public static void main(String[] args) {
		String a[] = { "A", "E", "I" };
	    String b[] = { "O", "U" };
//	Using list
	    List list = new ArrayList(Arrays.asList(a));
	    list.addAll(Arrays.asList(b));
	    System.out.println(Arrays.toString(list.toArray()));
//		Using Stream
String[] both = Stream.concat(Arrays.stream(a), Arrays.stream(b)).toArray(String[]::new);
	    System.out.println(Arrays.toString(both));
//		Using Flatmap
String[] both1 = Stream.of(a, b).flatMap(Stream::of).toArray(String[]::new);
	    System.out.println(Arrays.toString(both1));
	}
}
