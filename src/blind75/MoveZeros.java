package blind75;

import java.util.Arrays;
import java.util.LinkedList;

public class MoveZeros {

	public static void main(String[] args) {
		int[] nums={0,1,0,2,0,3};
		System.out.println((pushZeros(nums)));
	}

	private static LinkedList<Integer> pushZeros(int[] nums) {
		int count=0;
		LinkedList<Integer> llist=new LinkedList<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				llist.addFirst(nums[i]);
			}else {
				llist.addLast(nums[i]);
			}
		}
		return llist;
	}

}
