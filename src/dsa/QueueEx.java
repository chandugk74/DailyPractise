package dsa;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	// Queue = FIFO data structure. First-In First-Out
//	A collection designed for holding elements prior to processing
	// Linear data structure
	// add = enqueue, offer()
//	remove = dequeue, poll()
	// Where are queues useful?
	// 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
	// 2. Printer Queue (Print jobs should be completed in order)
	// 3. Used in LinkedLists, PriorityQueues, Breadth-first search

	public static void main(String[] args) {
//		Queue<String> queue1 = new Queue<String>();
		//we cannot instansiate queue bcoz its interface. 
//		we can instantiate through linkedlist like below
		Queue<String> queue = new LinkedList<String>();
		System.out.println(queue.isEmpty());
		queue.add("chandra");
		queue.offer("nalina");
		queue.offer("kavya");
		queue.offer("divya");
		queue.offer("nanu");
		queue.add("neenu");
		System.out.println(queue.isEmpty());//check empty or not
		System.out.println(queue);
		System.out.println(queue.peek());//check the first one
		System.out.println(queue.poll());//remove the head one(first one)
		System.out.println(queue.size());//check size
		System.out.println(queue.contains("chandra"));//check the object
		System.out.println(queue.contains("divya"));//check the object
	}

}
