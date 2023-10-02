package blind75;

import java.util.Arrays;

public class MoveZeross {

	public static void main(String[] args) {
		int arr[] = { 0,1, 0, 2, 3, 0, 0, 0, 2 };
		int[] newarr=new int[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				newarr[count]=arr[i];
				count++;
			}
		}
		System.out.println(Arrays.toString(newarr));

	}

}
