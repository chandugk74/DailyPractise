package basics;

public class CountNumberofWordsinString1 {
public static void main(String[] args) {
String str = "Name is java language gg hfju";
String[] st = str.split(" ");
	int count = 0;
	for (String s : st) {
		count++;
	}
System.out.println(count);
	}
}
