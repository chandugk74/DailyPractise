package blind75;

import java.util.Arrays;

public class MoveZeros_283 {

	public static void main(String[] args) {
		int[] nums={0,1,0,2,0,3};
		System.out.println(Arrays.toString(pushZeros(nums)));
	}
	private static int[] pushZeros(int[] nums) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				nums[count++]=nums[i];
			}
		}
		while(count<nums.length) {
			nums[count++]=0;
		}
		return nums;
	}

}
