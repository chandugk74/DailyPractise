package basics;

public class PrintUpperCaseWordStringArray1 {

	public static void main(String[] args) {
		String[] str = { "Chandra", "nalina", "Bhanu" };
		for (String st : str) {
			if (st.matches("[A-Z].*?")) {
				System.out.println(st);
			}
		}
	}

}
