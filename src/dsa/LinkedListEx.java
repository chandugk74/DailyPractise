package dsa;

import java.util.LinkedList;

public class LinkedListEx {
	// LinkedList = stores Nodes in 2 parts (data + address)
	// Nodes are in non-consecutive memory locations
	// Elements are linked using pointers
	// Singly Linked List
	// Node Node Node
	// [data | address] -> [data | address] -> [data address]
	// Doubly Linked List
	// Node Node
//		[address | data | address] <-> [address | data | address]
	// advantages?
//			 1. Dynamic Data Structure (allocates needed memory while running)
//		     2. Insertion and Deletion of Nodes is easy. 0(1)
//			 3. No/Low memory waste
//	disadvantages?
//			1. Greater memory usage (additional pointer)
//			2. No random access of elements (no index [i])
//			3. Accessing/searching elements is more time consuming. O(n)
//	uses?
//			1. implement Stacks/Queues
//			2. GPS navigation
//			3. music playlist	
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("chandra");
		linkedList.push("nalina");
		linkedList.offer("bhanu");
		linkedList.add("divya");
		linkedList.push("kavya");
		linkedList.offer("puni");
		System.out.println(linkedList);
		System.out.println(linkedList.peek());
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		System.out.println(linkedList.removeFirst());
		System.out.println(linkedList.removeLast());

	}

}
