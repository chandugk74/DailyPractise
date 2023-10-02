package basics;

public class ClosestToTargetNumber1 {
	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 5, 7, 9 };
		int num = 4;
		int temp = Math.abs(arr[0] - num); // 5
		int temp1 = Math.abs(arr[0] - num);// 5
		int dummy = 0;
		int dummy1 = 0;
		for (int i = 1; i < arr.length; i++) {
			int target = Math.abs(arr[i] - num);// 4 target temp temp1
			if (target <= temp) { // 4<=5 4 <= 5 5
				temp = target; // 5=4 4
				dummy = arr[i]; // 2
				if (temp < temp1) {// 4<=5 <
					temp1 = temp; // 5=4 4
					dummy1 = dummy;// 2=2
				}
			}
		}
		if (temp == temp1 && dummy1 != dummy) {
//			System.out.println(temp + " " + dummy);
//			System.out.println(temp1 + " " + dummy1);
			System.out.println(dummy);
			System.out.println(dummy1);
		} else {
//			System.out.println(temp + " " + dummy);
			System.out.println(dummy);
		}
	}
}
