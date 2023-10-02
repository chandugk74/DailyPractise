package blind75;

public class ReverseOnlyLetters_917 {

	public static void main(String[] args) {
		String str="jha634%&^jnbj*7jjhg";
		System.out.println(reverseOnlyLetters(str));

	}
	public static String reverseOnlyLetters(String str) {
		int start=0;
		int end=str.length()-1;
		char[] ch = str.toCharArray();
		while(start<end) {
			if(!Character.isLetter(ch[start])) {
				start++;
			}else if (!Character.isLetter(ch[end])){
				end--;
			}else {
				char temp=ch[start];
				ch[start]=ch[end];
				ch[end]=temp;
				start++;
				end--;
			}
		}
		return new String(ch);
	}
}
