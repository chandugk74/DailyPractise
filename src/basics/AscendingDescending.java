package basics;

import java.util.Arrays;
import java.util.Collections;

public class AscendingDescending {
	public static void main(String[] args) {
		Integer[] ll = { 2,1,3,4,5,6 ,7};
		int n = ll.length;
        Arrays.sort(ll, 0, n / 2);
		Arrays.sort(ll, n / 2, n, Collections.reverseOrder());
		System.out.println(Arrays.toString(ll));
	}

}
