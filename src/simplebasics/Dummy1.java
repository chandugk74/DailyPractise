package simplebasics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Dummy1 {
	public static void main(String[] args) {
	String str="chandraaa";
	int orig_len=str.length();
	int fin_len=str.replaceAll("a", "").length();
	int count=orig_len-fin_len;
	System.out.println(count);

	}
}
