package collectionsEx;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayListEx {

	public static void main(String[] args) {
		 String string1 = "aabacdceefeg";
		    Map<Character,Long> countMap = string1.chars().mapToObj(i -> (char)i).collect(
		            Collectors.groupingBy(Function.identity(), Collectors.counting())
		        );
		    System.out.println(countMap);
	}

}
