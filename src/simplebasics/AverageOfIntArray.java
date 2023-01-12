package simplebasics;

public class AverageOfIntArray {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6};
		double sum =0;
		for(int total:num) {
//			sum = sum+ total;
			sum =+ total;
		}
		double result = sum/num.length;
		System.out.println(result);
	}
}
