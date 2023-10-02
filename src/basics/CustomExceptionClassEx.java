package basics;

public class CustomExceptionClassEx extends Exception { // 1. custom exception class must extending Exception class
	String message; // 2. Create one string variable to store the exception message

	CustomExceptionClassEx(String str) { // 3. pass the string argument to the constructor
		this.message = str;
	}

	public String toString() { // 4. toString() method is used to print out the exception message.
		return ("Custom Exception occured :" + message);
	}

	public static class MainException {
		public static void main(String[] args) {
			try { // 5. throwing a CustomException using try-catch block in the main method and
					// Inside the catch block, we are print out the message.
				throw new CustomExceptionClassEx(" this is a custom message");
			} catch (CustomExceptionClassEx e) {
				System.out.println(e);
			}
		}
	}
}
