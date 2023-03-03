package basics;

public class StringToInt {

	public static void main(String[] args) {
		String s = "abc123";
		int num = 0;
		for(int i = 0; i < s.length(); i++) {
		    num *= 10;
		    num += s.charAt(i) - '0';
		    System.out.println("i :" + num);
		}
	}

}
