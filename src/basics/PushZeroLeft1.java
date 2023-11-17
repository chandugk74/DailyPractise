package basics;

public class PushZeroLeft1 {
public static void zerosToLeft(int[] arr) {
        int zeros = 0;
for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[zeros];
                arr[zeros] = temp;
                zeros++;
            }
        }
    }
public static void main(String[] args) {
int[] arr = { 0, 2, 0, 3, 4, 0, 5, 0 };
		zerosToLeft(arr);
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
