package streamfilter;

import java.util.Arrays;
import java.util.List;

public class FirstElementOfList {
public static void main(String[] args) {
List<Integer> myList = Arrays.asList(10,15,8);
myList.stream().findFirst().
ifPresent(System.out::println);
	}
}
