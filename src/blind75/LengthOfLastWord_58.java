package blind75;

public class LengthOfLastWord_58 {
	public static void main(String[] args) {
		String str="my name is java";
		System.out.println(lengthofWord(str));
	}
	private static int lengthofWord(String str) {
		String st=str.trim();
		int count=0;
		for(int i=st.length()-1;i>=0;i--) {
			if(st.charAt(i)!=' ') {
				count++;
			}else{
				break;
			}
		}
		return count;
	}
}
