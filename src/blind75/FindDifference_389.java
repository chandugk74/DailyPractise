package blind75;

public class FindDifference_389 {
	public static void main(String[] args) {
		String s1="ab";
		String s2="abc";
		System.out.println(findDiff(s1,s2));
	}
	private static char findDiff(String s1, String s2) {
		char ch=0;
		for(char cs1:s1.toCharArray())
			ch^=cs1;
		for(char cs2:s2.toCharArray())
			ch^=cs2;
		return ch;
	}
}
