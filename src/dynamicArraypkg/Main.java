package dynamicArraypkg;

public class Main {

	public static void main(String[] args) {
//		DynamicArrayEx dynamicArrayEx = new DynamicArrayEx();
		DynamicArrayEx dynamicArrayEx = new DynamicArrayEx(5);
		dynamicArrayEx.add("a");
		dynamicArrayEx.add("b");
		dynamicArrayEx.add("c");
		dynamicArrayEx.add("d");
		dynamicArrayEx.add("a");
		dynamicArrayEx.add("b");
		
//		dynamicArrayEx.insert(0, "A");
//		dynamicArrayEx.delete("d");
		System.out.println(dynamicArrayEx);
		System.out.println(dynamicArrayEx.capacity);
		System.out.println(dynamicArrayEx.size);
		System.out.println(dynamicArrayEx.isEmpty());

	}

}
