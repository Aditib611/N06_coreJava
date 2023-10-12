package org.tnsif.collections;

import java.util.ArrayDeque;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		queue.add(45);
		queue.add(55);
		queue.add(5);
		queue.add(14);
		queue.add(74);
		
		
		System.out.println("First element: " + queue.getFirst());
		System.out.println("Last element: " + queue.getLast());
		System.out.println( queue.remove() + " Last element removed!!"); 
		//element inserted first will be removed first because queue follows FIFO order
		System.out.println("First element is now: " + queue.peek());
		//System.out.println( queue.remove() + " Last element removed!!"); 
		while(!queue.isEmpty()) {
			System.out.println( queue.remove()); 
		}
	}

}
