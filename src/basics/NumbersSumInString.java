package basics;

public class NumbersSumInString {

	public static void main(String[] args) {
		 // Declare and Initialize a string (with digits)
        String stringWithDigit = "1ab26xyz88www5";
        // initialize sum variable
        int sum = 0;
         for (int i = 0; i < stringWithDigit.length(); i++) {
            // extract single character from string
            char ch = stringWithDigit.charAt(i);
 
            // check digit character
            if (Character.isDigit(ch)) {
                 // convert character to digit and add into sum variable
                int digit = Character.getNumericValue(ch);
                sum = sum + digit;
            }
        }
        // finally return the calculated sum
        System.out.println(sum);
	}

}
