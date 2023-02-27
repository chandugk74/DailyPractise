package ArrayEx;

public class Dummy {
	public static void main(String[] args) {
		String str = "my name is";
		int count = 0;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)== ' ' && str.charAt(i)!= ' ')
				count++;
		}
		System.out.println(count);
	}
}
