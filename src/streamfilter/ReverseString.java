package streamfilter;

import java.util.stream.IntStream;

public class ReverseString {
public static void main(String[] args) {
String str = "my name is ";
String reversed =
new StringBuilder(str).reverse().toString();
	System.out.println(reversed);
//		***********
int len = str.length();
IntStream.range(0, len).map(i -> len - 1 - i)
.mapToObj(j->str.charAt(j)).forEach
(System.out::print);
	}
}
