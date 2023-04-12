package leetCode;

public class LengthOfLastWord {
	public static void main(String[] args) {
		String str = "   my name is java  ";
		String st = str.trim();
		int count =0;
		for (int i = st.length()-1; i >= 0; i--) {
			if(st.charAt(i)!=' ') {
				count++;
			}else {
				break;
			}
		}
		System.out.println(count);
	}

}
