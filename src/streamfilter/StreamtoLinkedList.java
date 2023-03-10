package streamfilter;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamtoLinkedList {
	 public static void main(String[] args) 
	    {   
	        Stream<String> streamTo = Arrays.asList("A", "B", "C", "D").stream();  //Stream
	         
	        List<String> llList = streamTo
	                    .collect(Collectors.toCollection(LinkedList::new));     //Stream -> LinkedList
	 
	        System.out.println(llList);  
	    }
}
