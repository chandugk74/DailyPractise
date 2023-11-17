package basics;

import java.util.stream.Collectors;

public class PrintDuplicateStrings {
public static void main(String[] args) {
		String str = "nalina";
char[] inp = str.toCharArray();
for (int i = 0; i < str.length(); i++) {
for (int j = i + 1; j < str.length(); j++) {
	if (inp[i] == inp[j]) {
System.out.print(inp[i] + " ");
				}
			}
		}
	}
}
