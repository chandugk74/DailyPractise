package basics;

public class MissingLetter {
	public static void main(String[] args) {
		String[] str_arra = { "p", "r", "s", "t" };
		String result = test(str_arra);
		System.out.printf(result);
	}

	public static String test(String[] str_arra) {
		int c = str_arra[0].charAt(0) + 1;
		for (int i = 1; i < str_arra.length; i++, c++)
			if (str_arra[i].charAt(0) != c)
				return String.valueOf((char) c);
		return "";
	}
}
