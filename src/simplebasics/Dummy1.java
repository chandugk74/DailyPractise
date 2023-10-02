package simplebasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Dummy1 {
	public static void main(String[] args) {
		int arr[] = { 0,1, 0, 2, 3, 0, 0, 0, 2 };
		int[] result= new int[arr.length];
		int count=0;
		for(int n:arr) {
			if(n!=0) {
				result[count++]=n;
			}
		}
		System.out.println(Arrays.toString(result));	
	}
}
