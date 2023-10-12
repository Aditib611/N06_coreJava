package org.tnsif.collections;
import java.util.*;
import java.util.LinkedList;

public class LinkedListDemo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> numberList = new LinkedList<>();
		numberList.add(24);
		numberList.add(20);
		numberList.add(47);
		numberList.add(7);
		numberList.add(23);
		numberList.add(56);
		
		System.out.println(numberList);
		
		numberList.addFirst(14);
		numberList.addLast(69);
		System.out.println(numberList);
		
		System.out.println("First Element: "+ numberList.getFirst());
		
		System.out.println("Last Element: "+ numberList.getLast());
		
         System.out.println("First Element Removed: "+ numberList.removeFirst());
		
		System.out.println("Last Element Removed: "+ numberList.removeLast());
		
		System.out.println(numberList);
		
		
		//iterator iterate only in forward direction and we can remove current element we can add new elemnt, remove current element and update
		Iterator<Integer> it = numberList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			//it.remove();
		}
			System.out.println(numberList);
			
			//list iterator traversed in both forward and backward
			//FORWARD
			ListIterator<Integer> listIt = numberList.listIterator();
			while(listIt.hasNext()) {
				System.out.println(listIt.next());
			}
			System.out.println("---------------------------------------------");
			while(listIt.hasPrevious()) {             //BACKWARD
				System.out.println(listIt.previous());
			}
			
			System.out.println("-Starting from 2 element and traversing in backward-");
			listIt = numberList.listIterator(2);
			System.out.println(listIt.next());
			while(listIt.hasPrevious()) {
				System.out.println(listIt.previous());
			}
			
			/*System.out.println("-Starting from last element and traversing in backward-");
			listIt = numberList.listIterator(numberList.size());
			System.out.println(listIt.previous());
			while(listIt.hasPrevious()) {
				System.out.println(listIt.previous());
			}*/
			System.out.println("-Starting from element at index 2 adding 100to the previous-");
			System.out.println(numberList);
			listIt = numberList.listIterator(numberList.size());
			while(listIt.hasPrevious()) {
				int no = listIt.previous();
				
				System.out.println(no);
				if(no == 23)
					listIt.add(100);
				if(no == 23)
					listIt.set(126);
				//if(no == 100)
				//	listIt.remove(100);
				
				
			}System.out.println(numberList);
			
		
		
		
	
	}

}
