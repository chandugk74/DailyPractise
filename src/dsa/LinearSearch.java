package dsa;

public class LinearSearch {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int index = isLinear(array, 5);
		if (index != -1) {
			System.out.println(index + " position");
		} else {
			System.out.println("not found");
		}
	}

	public static int isLinear(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}
}
