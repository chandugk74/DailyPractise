package ArrayEx;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dummy {
	public static void main(String[] args) {
		// ArrayList with duplicate elements
		List<Integer> numList = Arrays.asList(1, 2, 2, 3, 3, 3);
		Map<Integer, Long> countInt = numList.stream().collect(Collectors
				.toMap(Function.identity(), v ->1L, Long::sum));
		System.out.println(countInt);

	}
}