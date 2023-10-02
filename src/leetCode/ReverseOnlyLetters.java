package leetCode;

public class ReverseOnlyLetters {
	public static void main(String[] args) {
		String str="hdfgh^&*$#jjbdrs";
		int start=0;
		int end=str.length()-1;
		char ch[] =str.toCharArray();
		while(start<end) {
			if(!Character.isLetter(ch[start])) {
				start++;
			}else if(!Character.isLetter(ch[end])) {
				end--;
			}else {
				char temp=ch[start];
				ch[start]=ch[end];
				ch[end]=temp;
				start++;
				end--;
			}
		}
		System.out.println(ch);
	}
}
