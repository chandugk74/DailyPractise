package basics;

import java.util.Random;

public class RandomNumbersAndString {

	public static void main(String[] args) {
		
		Random rc = new Random();
		int random_num=rc.nextInt(10);		//add any number in place of 10
//		String random_num=rc.nextLine(name);		//add any number in place of 10
		System.out.println(random_num);
		}
}
