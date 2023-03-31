package simplebasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Dummy1  {
	public static void main(String[] args) {
		String a[] = { "A", "E", "I" };
	    String b[] = { "O", "U" };
	    List ll = new ArrayList(Arrays.asList(a));
	    ll.addAll(Arrays.asList(b));
	    Object[] c = ll.toArray();
	    System.out.println(Arrays.toString(c));

	    
}
}