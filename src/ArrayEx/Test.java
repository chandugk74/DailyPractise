package ArrayEx;

public class Test {

	public static void main(String[] args) {
		String str = "jhsdfg665sdg6";
		int sum=0;
		for(int i =0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				int digit =Character.getNumericValue(ch);
				 sum=sum+digit;
			}
		}
		System.out.println(sum);
	}
}
