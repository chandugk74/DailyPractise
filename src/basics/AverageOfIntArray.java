package basics;

public class AverageOfIntArray {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6};
		double sum =0;
		for(int i=0;i<num.length;i++) {
//			sum = sum+ total;
			sum =sum + num[i];
		}
		double result = sum/num.length;
		System.out.println(result);
	}
}
