package streamfilter;

import java.util.Arrays;

public class CountNumberofWordsinString {

	public static void main(String[] args) {
		String s="i am java";
		String[] st = s.split(" ");
		System.out.println(Arrays.stream(st).count());
	}

}
