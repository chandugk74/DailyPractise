package basics;

public class PrintUpperCaseWordStringArray {

	public static void main(String[] args) {
		String[] str = { "Chandra", "nalina", "Bhanu" };
		for(int i=0;i<str.length;i++) {
			char ch = str[i].charAt(0);
			if(Character.isUpperCase(ch)) {
				System.out.println(str[i]);
			}
		}
	}

}
