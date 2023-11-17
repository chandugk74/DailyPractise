package streamfilter;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesString {
public static void main(String[] args) {
String str="aabbdddccc";
char[] ch =str.toCharArray();
HashSet<Character> hset =
new HashSet<Character>();
StringBuilder sb= new StringBuilder();
		for(char chr:ch) {
	if(!hset.contains(chr)) {
				hset.add(chr);
				sb.append(chr);
			}
		}
System.out.println(sb);
	}
}
