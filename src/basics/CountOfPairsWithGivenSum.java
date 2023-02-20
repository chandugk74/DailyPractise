package basics;

public class CountOfPairsWithGivenSum {
	public static void main(String args[]) {
		int[] arr = { 1, 3, 2, 3, 4, 5, 6, 0 };
		int sum = 6;
		int count = 0;
		for (int i = 0; i < arr.length; i++)
			for (int j = i + 1; j < arr.length; j++)
				if ((arr[i] + arr[j]) == sum)
					count++;

		System.out.print("Count of pairs is " + count);
	}
}
