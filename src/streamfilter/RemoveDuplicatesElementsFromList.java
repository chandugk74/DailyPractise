package streamfilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesElementsFromList {
	   public static void main(String[] args){
		      List<String> list = new ArrayList<String> (Arrays.asList("Ryan","Kevin","Ryan","Harry","Mark","Mark"));
		      System.out.println("ArrayList = "+list);
		      List<String> list2 = list.stream()
		      .distinct()
		      .collect(Collectors.toList());
		      System.out.println("Updated ArrayList without duplicates = "+list2);
		   }
}
