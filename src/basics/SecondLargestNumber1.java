package basics;

public class SecondLargestNumber1 {

	public static void main(String[] args) {
		 int[] nums = { 6, 9, 11, 1, 10 };

	        int max = Integer.MIN_VALUE;
	        int secmax = Integer.MIN_VALUE;

	        for(int i=0; i<nums.length; i++) {
	            if(nums[i]>max ) {
	                secmax = max;
	                max=nums[i];
	            }else if(nums[i]>secmax){
	                secmax=nums[i];
	            }
	         }
	        System.out.println("1st H value: " + max);
	        System.out.println("2nd H Value: " + secmax);
	}

}
