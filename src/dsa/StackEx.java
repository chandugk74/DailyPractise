package dsa;

import java.util.Stack;

public class StackEx {
	// stack = LIFO data structure. Last-In First-Out
	// stores objects into a sort of "vertical tower"
	// push() to add to the top
	// pop() to remove from the top
	// uses of stacks?
	// 1. undo/redo features in ditors
	// 2. moving back/forward through browser history
	// 3. backtracking algorithms (make, file directories)
	// 4. calling functions (call stack)
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
//		stack works like LIFO- last in first out
		System.out.println(stack.empty());//empty before add, so true
		stack.push("chandra");
		stack.push("puni");
		stack.push("bhanu");
		stack.push("nalina");
		stack.push("kavya");
		stack.push("divya");
		stack.push("nanu");
		stack.push("neenu");
		stack.pop();//pop() by default remove the last added.
		String popOne=stack.pop();
		System.out.println(popOne);//will tell which one poped 
		System.out.println(stack.empty());//check empty or not. return boolean
		System.out.println(stack);//print all
		System.out.println(stack.pop());//pop() by default remove the last added.
		System.out.println(stack);//print the left stack after removed by pop
		System.out.println(stack.peek());//tell the first one, i.e., the last added one
		System.out.println(stack.search("kavya"));//search content wise, (index starts from 1)
		System.out.println(stack.search("chandra"));//search content wise, (index starts from 1)
//		for(int i=0;i<10000000000;i++) {//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
//			stack.push("chandra");
//		}
		}
}
