package simplebasics;

public class ElectricityBill {

	public static void main(String[] args) {
		int units = 280;
		double billpay = 0;
		if (units < 100) {
			billpay = units * 1;
		} else if (units < 300) {
			billpay = 100 * 1 + (units - 100) * 2.0;
		} else if (units > 300) {
			billpay = 100 * 1 + 200 * 2.0 + (units - 300) * 3;
		}
		System.out.println(billpay);
	}

}
