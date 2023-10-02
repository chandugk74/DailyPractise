package blind75;

public class FindDifference {
	public static void main(String[] args) {
		String s1="ab";
		String s2="abc";
		System.out.println(findDiff(s1,s2));
	}
	private static char findDiff(String s1, String s2) {
		int sum1=0,sum2=0;
		for(char c1:s1.toCharArray()) {
			sum1=sum1+c1;
		}
		for(char c2:s2.toCharArray()) {
			sum2=sum2+c2;
		}
		return (char) (sum2-sum1);
	}
}
