package blind75;
//Given a string s, find the first 
//non-repeating character in it and return its index. If it does not exist, return -1.
public class FirstUniqueCharacterInString_387 {
	public static void main(String[] args) {
	System.out.println(firstUniqChar("chandra"));
	}
	public static int firstUniqChar(String str) {
        for(char c : str.toCharArray()){
            int index = str.indexOf(c);
            int lastIndex = str.lastIndexOf(c);
                if(index == lastIndex)
                return index;
        }
        return -1;
    }
}
