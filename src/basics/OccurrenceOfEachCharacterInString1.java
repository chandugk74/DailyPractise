package basics;

public class OccurrenceOfEachCharacterInString1 {
public static void main(String args[]) {
String str = "chandrashekara g k";
int counter[] = new int[256];
for (int i = 0; i < str.length(); i++) {
			counter[str.charAt(i)]++;
		}
for (int i = 0; i < counter.length; i++) {
			if (counter[i] != 0) {
System.out.println((char) i+" "+ counter[i] );
			}
		}
	}
}
