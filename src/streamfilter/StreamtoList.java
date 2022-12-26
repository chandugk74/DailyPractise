package streamfilter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamtoList {
	public static void main(String[] args) 
    {   
        Stream<String> tokenStream = Stream.of("A", "B", "C", "D");   //Stream
         
        List<String> tokenList = tokenStream.collect(Collectors.toList());    //Stream -> List
 
        System.out.println(tokenList);  
    }
}
