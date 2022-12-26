package basics;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

	public static void main(String[] args) {
		Integer[] ll = { 1, 2, 3, 4, 5 };
		Collections.reverse(Arrays.asList(ll));
		System.out.println(Arrays.toString(ll));
	}

}
