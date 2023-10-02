package streamfilter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStringsByThirdCharacter {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Orange");

// Sort the strings based on the third character
Collections.sort(strings, Comparator.comparing(s -> s.charAt(2)));
strings.forEach(System.out::println);
    }
}

