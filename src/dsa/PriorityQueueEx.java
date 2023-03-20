package dsa;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	public static void main(String args[])
	{
	//Priority Queue = A FIFO data structure that serves elements
//	with the highest priorities first
//	before elements with lower priority
//	Queue<Double> queue = new PriorityQueue<>();//print ascending
	Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());//print descending
	queue.offer(3.0);
	queue.offer(2.5);
	queue.offer(4.0);
	queue.offer(1.5);
	queue.offer(2.0);
	queue.add(1.2);
	while (!queue.isEmpty()) {
	System.out.println(queue.poll());
	}
	}
}
