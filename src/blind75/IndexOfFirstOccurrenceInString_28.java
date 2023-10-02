package blind75;

public class IndexOfFirstOccurrenceInString_28 {
public static void main(String[] args) {
		String s1 = "butsad";
		String s2 = "sad";
		System.out.println(indexOf(s1, s2));
	}
public static int indexOf(String s1, String s2) {
for (int i = 0; i < s1.length() - s2.length() + 1; i++) {
  if (s1.charAt(i) == s2.charAt(0)) {
	if (s1.substring(i, s2.length() + i).equals(s2)) {
					return i;
				}
			}

		}
		return -1;
	}
}
