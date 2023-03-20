package basics;

import java.util.Arrays;

public class RemoveEvenIntegersFromArray1 {
	private static int[] removeEven(int[] k, int n) {
	    int counter = 0;
	    for (int i = 0; i < n; i++) 
	        if (k[i] % 2 == 1)
	            k[counter++] = k[i];
	    for (int i=counter; i<n; i++)
	        k[i] = 0;
		return k;
	}
	
	public static void main(String[] args) {
		int n=0;
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] result = removeEven(arr, n);
		System.out.println(Arrays.toString(result));
	}
}
