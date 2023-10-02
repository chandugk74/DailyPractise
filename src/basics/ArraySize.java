package basics;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySize {
	public static void main(String[] args) {
//        int a=1;
//        int b=5;
		System.out.println(Arrays.toString(IntStream.rangeClosed(0, 5).toArray()));
	}
}
