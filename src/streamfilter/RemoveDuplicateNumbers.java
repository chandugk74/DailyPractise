package streamfilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 6, 6, 7, 8));
//		List<Integer> numbersList = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 6, 6, 7, 8);
		Set<Integer> setWithoutDuplicates = numbersList.stream().collect(Collectors.toSet());
		System.out.println(setWithoutDuplicates);
	}
}
