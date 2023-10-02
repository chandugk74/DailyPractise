package dsa;

//Bubble Sort is a simple sorting algorithm 
//that repeatedly steps through the list, 
//compares adjacent elements, and swaps 
//them if they are in the wrong order.
public class BubbleSort {
	public static void main(String[] args) {
int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
for (int i = 0; i < arr.length - 1; i++) {
for (int j = 0; j < arr.length - i - 1; j++) {
		if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
