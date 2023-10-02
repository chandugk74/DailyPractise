package methodOverloading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Dummy {
	public static void main(String[] args) {
		String str = "i am java";
		String[] s= str.split(" ");
		String rev="";
		for(int i=0;i<s.length;i++) {
			rev=s[i]+" "+rev;
		}
		System.out.println(rev);
	}
}
