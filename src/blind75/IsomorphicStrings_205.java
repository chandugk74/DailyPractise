package blind75;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings_205 {
	public static void main(String[] args) {
		String s1 = "egg";
		String s2 = "add";
		System.out.println(isoMarphic(s1, s2));
	}
	public static boolean isoMarphic(String s1, String s2) {
		Map hm = new HashMap();
		for (int i = 0; i < s1.length(); i++)
		if (hm.put(s1.charAt(i), i) != hm.put(s2.charAt(i), i))
		return false;
		return true;
	}
}
