package blind75;

public class ReverseVowelsOfString_345 {

	public static void main(String[] args) {
		System.out.println(reverseVowels("hello"));
	}
	private static boolean isVowel(char c) {
        if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
        	return true;
        }else {
        	return false;
        }
    }

	public static String reverseVowels(String s) {
	   
	    String vowels = "aeiouAEIOU";
	    char[] chars = s.toCharArray();
	    int start = 0;
	    int end = s.length()-1;
	    
	    while(start<end){
	    	if(!isVowel(chars[start])){
	            start++;
	        }   
	    	if(!isVowel(chars[end])){
	            end--;
	        }
	        char temp = chars[start];
	        chars[start] = chars[end];
	        chars[end] = temp;
	        start++;
	        end--;
	    }
	    return new String(chars);

}
}