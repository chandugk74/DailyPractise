package basics;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesElementsFromList {
	public static void main(String[] args){
	      ArrayList<String> list = new ArrayList<String>();
	      list.add("Jacob");
	      list.add("Gary");
	      list.add("Gary");
	      list.add("Harry");
	      list.add("Harry");
	      list.add("Kevin");
	      System.out.println("List = "+list);
	      Set<String> set = new LinkedHashSet<String>(list);
	      System.out.println("List after removing duplicate elements = "+set);
	   }
}
