package simplebasics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Dummy1 {
	public static void main(String[] args) {
		String str = "chandra G K";
		String[] st = str.split(" +");
		StringBuilder sb = new StringBuilder();
		for (int i = st.length - 1; i >= 0; i--) {
			sb.append(st[i]);
//			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
}
