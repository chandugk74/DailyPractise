package basics;

import java.util.TreeSet;

public class TreeSetEx implements Comparable<TreeSetEx> {
	String name;
	int id;

	public TreeSetEx(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;

	}

	public int getId() {
		return id;
	}
	public String toString() {
		return name+" "+id;
	}

	@Override
	public int compareTo(TreeSetEx treeSetEx) {
//		compare based on empID
		return Integer.compare(this.id, treeSetEx.id);
	}

	public static void main(String[] args) {
		TreeSet<TreeSetEx> treeset = new TreeSet<TreeSetEx>();
		treeset.add(new TreeSetEx("c", 3));
		treeset.add(new TreeSetEx("h", 2));
		treeset.add(new TreeSetEx("a", 1));
		treeset.add(new TreeSetEx("c", 5));
System.out.println(treeset);
	}

}
