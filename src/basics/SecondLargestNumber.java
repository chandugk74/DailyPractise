package basics;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		Integer[] ll = {1,22,39,42,46,55};
		Arrays.sort(ll);
		System.out.println(ll[ll.length-2]);
	}
}
