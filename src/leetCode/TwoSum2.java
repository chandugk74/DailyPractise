package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3,4 };
		int target = 7;
		int result[] = twoSum(array, target);
		System.out.println(Arrays.toString(result));
	}
	public static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}
