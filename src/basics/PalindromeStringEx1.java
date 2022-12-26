package basics;

public class PalindromeStringEx1 {

	public static void main(String[] args) {
	    System.out.println(isPalindrome("banana"));
	    System.out.println(isPalindrome("ana"));
	}
	public static Boolean isPalindrome(String word){
	    String rev = new StringBuilder(word).reverse().toString();
	    return word.equals(rev);
	    //return word == rev ; // not working because == tests for reference equality
	}

}
