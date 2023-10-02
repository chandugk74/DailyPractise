package blind75;
//https://www.youtube.com/watch?v=EajJXcTGxJg&ab_channel=Java2Novice
public class RansomNoteMagazine {
	public static void main(String[] args) {
		RansomNoteMagazine rn = new RansomNoteMagazine();
		System.out.println(rn.canConstruct("aa", "aab"));
		System.out.println(rn.canConstruct("aa", "ab"));
	}
public boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote == null || magazine == null)
			return false;
		int[] charTrack = new int[26];
		for (int i = 0; i < magazine.length(); i++) {
			charTrack[magazine.charAt(i) - 'a']++;
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			if (--charTrack[ransomNote.charAt(i) - 'a'] < 0)
				return false;
		}
		return true;
	}
}
