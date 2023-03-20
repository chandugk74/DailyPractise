package dsa;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListArrayList {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		ArrayList<Integer> arrayList = new ArrayList<>();
		long startTime;
		Long endTime;
		Long elapsedTime;
		for (int i = 0; i < 1000000; i++) {
			linkedList.add(i);
			arrayList.add(i);
		}
//		*****linkedlist***********
		startTime=System.nanoTime();
//		linkedList.get(0);
//		linkedList.get(500000);
		linkedList.remove(500000);


		endTime=System.nanoTime();
		elapsedTime=endTime-startTime;
		System.out.println("LinkedList: "+elapsedTime+ " ms");
//		*****arraylist***********
		startTime=System.nanoTime();
//		arrayList.get(0);
//		arrayList.get(500000);
		arrayList.remove(500000);

		endTime=System.nanoTime();
		elapsedTime=endTime-startTime;
		System.out.println("arrayList: "+elapsedTime+ " ms");

	}

}
