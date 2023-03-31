package basics;

public class RemoveDuplicateElementsFromSortedArray {

	public static void main(String[] args) {
		int[] arr= {1,1,2,2,3,4};
		int j = 0;
		int len = arr.length;
		int[] temp = new int[arr.length];
		for (int i = 0; i < temp.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j] = arr[i];
				j++;
			}
		}
		temp[j++] = arr[len - 1];
		for (int k = 0; k < j; k++) {
			System.out.print(temp[k] + " ");
		}
	}

}
