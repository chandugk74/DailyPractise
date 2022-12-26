package streamfilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesInteger {

    public static void main(String[] args) {
        Integer[] numberArr = new Integer[] {10,30,30,10,15,13,34,15};

       List<Integer> uniqueList = Arrays.asList(numberArr).stream().distinct().collect(Collectors.toList());
        for (Integer singleElement: uniqueList ) {
            System.out.println(singleElement);
        }

    }

}