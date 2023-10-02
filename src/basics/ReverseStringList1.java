package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringList1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Chandra", "Nalina"));
			Collections.reverse(list);
			System.out.println(list);
	}

}
