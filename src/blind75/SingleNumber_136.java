package blind75;

public class SingleNumber_136 {
	public static void main(String[] args) {
		int[] num= {1,2,3,1,3};
		System.out.println(singlrNum(num));
	}
	public static int singlrNum(int[] num) {
		int value=0;//since XOR with 0 returns same number
		for(int i=0;i<num.length;i++) {
//^ = XOR operator; a binary operator return 
//0 if two same nums found, else return 1 if found one num
value = value^num[i]; // ans = (ans) XOR (array element at i) 
			}
	return value;
	}
}
