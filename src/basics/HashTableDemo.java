package basics;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
//		HashMap m = new HashMap();
		Hashtable<Integer, String> m = new Hashtable<Integer, String>();
		m.put(1, "c");
		m.put(2, "h");
		m.put(3, "a");
		m.put(4, "n");
		m.put(5, "d");
//		add duplicate key...which can see updating (replacing)value
		m.put(1, "u");
		m.put(null, "g"); // if key null gives NullPointerException
		m.put(6, null); // if value null gives NullPointerException
		System.out.println(m); // get all map
		System.out.println(m.get(1)); // give Value using key
		System.out.println(m.remove(3)); // remove K,V pair
		System.out.println(m); // can see 3rd K,V deleted
		System.out.println(m.containsKey(3));// check key present
		System.out.println(m.containsKey(4));// check key present
		System.out.println(m.containsValue("d"));// check value present
		System.out.println(m.containsValue("f"));// check value present
		System.out.println(m.isEmpty());// map is empty or not
		System.out.println(m.keySet());// get only keys from map in the form of set (no duplicates)
		System.out.println(m.values());// get only keys from map in the form of collections(may have duplicate values)
		System.out.println(m.entrySet());// return all entries as set
//read keys indivisually
		for (int i : m.keySet()) {
			System.out.println(i);
		}
//read values indivisually
		for (Object i : m.values()) {
			System.out.println(i);
		}
		// read keys indivisual wrt to value
		for (Object O : m.keySet()) {
			System.out.println(O + "    " + m.get(O));
		}

	}
}
