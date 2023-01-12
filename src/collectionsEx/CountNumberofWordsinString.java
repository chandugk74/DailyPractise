package collectionsEx;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.sun.org.apache.xpath.internal.functions.Function;

public class CountNumberofWordsinString {

	public static void main(String[] args) {
		printCountOfDuplicateCharMapCompute("bbbcccccddddddaaaaz");
	}

	private static void printCountOfDuplicateCharMapCompute(String input) {

		Map<Character, Integer> output = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			output.compute(ch, (key, value) -> (value == null) ? 1 : value + 1);

		}

		System.out.println(output);

	}
}