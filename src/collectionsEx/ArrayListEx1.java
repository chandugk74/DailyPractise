package collectionsEx;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("chandru");
		al.add(1.1);
		al.add(true);
		al.add('a');	//character ' ' 
		System.out.println(al);
		//size
//		System.out.println("number of elements: "+ al.size());
//		//Remove
//		al.remove(2);		//passing index
////		al.remove(1.1);		//passing element
//		System.out.println("number of elements after removing: "+ al);
//		
//		//insert using index or element
//		//add(index, object)
//		al.add(2, "Java");
//		System.out.println("number of elements after insertion: "+ al);
//		
//		//retrieve by passing index
//		System.out.println(al.get(2));
//		//change or replace element
//		al.set(2, "python");
//		System.out.println("number of elements after replacing: "+ al);
//		
//		//contains() to check present or not
//		System.out.println(al.contains("python"));
//		
//		//isEmpty()
//		System.out.println(al.isEmpty());
//		
		//1. for loop
//		System.out.println("reading elements using for loop");
//		for(int i = 0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
		
		// 2. for each loop
//		System.out.println("reading elements using for each loop");
//		for(Object o : al) {
//			System.out.println(o);
//		}
		// 3. iterator
		System.out.println("reading elements using iterator");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
