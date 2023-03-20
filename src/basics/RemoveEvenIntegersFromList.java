package basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveEvenIntegersFromList {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(101);
		numbers.add(200);
		numbers.add(301);
		numbers.add(400);
		Iterator<Integer> itr = numbers.iterator();
		while (itr.hasNext()) {
			Integer number = itr.next();
			if (number % 2 == 0) {
				itr.remove();
			}
		}
		System.out.println(numbers);

	}
}