package basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccurenceOfMaxIntegersInArray {

	public static void main(String[] args) {
		int[] arr= {2,2,3,4,5};
		System.out.println(maxInteger(arr));

	}
	public static int maxInteger(int[] num) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < num.length; i++) {
			if(hm.containsKey(num[i])) {
				hm.put(num[i], hm.get(num[i])+1);
					}else {
						hm.put(num[i], 1);
					}
			}
		int x=0;
		int max=-1;
		for (Entry<Integer, Integer> mm:hm.entrySet()) {
			if(mm.getKey()==mm.getValue()) {
				x=mm.getValue();
				max=Math.max(x, max);
			}
		}
		return max;
		}
	}


