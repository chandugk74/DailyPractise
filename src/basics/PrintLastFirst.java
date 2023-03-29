package basics;

public class PrintLastFirst {

	public static void main(String[] args) {
		String str = "Jitendra";
		for(int i=0;i<str.length()/2;i++) {
			System.out.println(str.charAt(i)+" "+str.charAt(str.length()-1-i));
		}
	}
}
