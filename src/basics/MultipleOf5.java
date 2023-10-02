package basics;

import java.math.BigInteger;
import java.util.stream.Stream;

public class MultipleOf5 {

	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if (i % 5 == 0) {
				System.out.print(i + ", ");
				Stream.iterate(BigInteger.ONE, 
			               x -> x.multiply(BigInteger.valueOf(2)))
			      .forEach(System.out::println);
			}
		}
	}

}
