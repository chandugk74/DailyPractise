package variables;

//class must extend exception class
public class CustomExceptionClassEx extends Exception {
		String message;
		public CustomExceptionClassEx(String message) {
			this.message=message;
		}
		public String toString() {
			return ("Custom exception occured: "+message);
		}
		
		public static class Main{
			public static void main(String[] args) {
				try {
throw new CustomExceptionClassEx("custom exception class");
				}catch(CustomExceptionClassEx e) {
					System.out.println(e);
				}
			}
		}
	}


