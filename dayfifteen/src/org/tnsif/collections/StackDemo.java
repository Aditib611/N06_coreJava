package org.tnsif.collections;
//Dynamic implementation of stack

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		st.add(17);
		st.add(27);
		st.add(45);
		st.add(3);
		st.add(46);
		st.add(52);
		
		System.out.println("Size of Stack" + st.size());
		System.out.println("Elements to be removed first: " + st.peek()); 
		System.out.println("-----------------------------------------------"); ///last will be removed beacuse stack follows LIFO order
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		
	}

}
