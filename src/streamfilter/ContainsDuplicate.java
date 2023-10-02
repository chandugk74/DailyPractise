package streamfilter;

import java.util.Arrays;
import java.util.List;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 1 };
		boolean containsDuplicate = false;
		if (Arrays.stream(array).distinct().count() != array.length) {
			containsDuplicate = true;
		}
		System.out.println(containsDuplicate);
//***********		
		List<Integer> ll = Arrays.asList(1, 2, 3, 4,1);
		boolean isdups=false;
		if(ll.stream().distinct().count()!=ll.size()) {
			isdups=true;
		}
		System.out.println(isdups);
	}

}
