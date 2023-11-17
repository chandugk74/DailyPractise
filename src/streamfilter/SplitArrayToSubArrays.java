package streamfilter;

import java.util.*;
import java.util.stream.*;

public class SplitArrayToSubArrays {
public static void main(String args[]) {
Integer[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9,10,11 };
	int splitSize = 3;
for(int i=0;i<=original.length;i+=splitSize) {
System.out.println(Arrays.toString(Arrays.copyOfRange
(original, i, Math.min(original.length, i+splitSize))));
		}
	}
}