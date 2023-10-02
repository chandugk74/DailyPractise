package basics;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 7, 9, 1, 5 };
		HashSet<Integer> set = new HashSet<>();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int num : arr) {
			set.add(num);
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}}
		for (int i = min; i <= max; i++) {
			if (!set.contains(i)) {
				System.out.print(i + " ");
}}}}
