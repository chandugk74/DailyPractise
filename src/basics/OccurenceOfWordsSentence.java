package basics;

public class OccurenceOfWordsSentence {

	public static void main(String[] args) {
		String str = "i am java i am java";
		String[] st = str.split(" ");
		for (int i = 0; i < st.length; i++) {
			int count = 0;
			for (int j = 0; j < st.length; j++) {
				String s1=st[i];
				String s2=st[j];
				if (j < i && s1.equals(s2)) {
					break;
				}
				if (s1.equals(s2)) {
					count++;
				}
				if (j == st.length - 1) {
					System.out.println(st[i] + " " + count);
				}
			}
		}
	}

}
