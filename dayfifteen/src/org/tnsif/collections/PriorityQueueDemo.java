package org.tnsif.collections;

import java.util.*;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();//priority(ascending) is decided while removing elements
		queue.add(45);
		queue.add(55);
		queue.add(5);
		queue.add(14);
		queue.add(74);
		
		System.out.println("element to be removed first: " + queue.peek());
		
		System.out.println( queue.remove() + "removed!!"); 
		
		
		while(!queue.isEmpty()) {
			System.out.println( queue.remove()); 
		}
	}
}


