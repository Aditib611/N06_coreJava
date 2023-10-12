/*program to demonstrate homogeneous List*/
package org.tnsif.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<Integer>();
		System.out.println("size: " + intList.size());
		intList.add(10);
		intList.add(2);
		intList.add(30);
		intList.add(33);
		intList.add(40);
		intList.add(6);
		//intList.add("Hello"); compile time error 
		System.out.println(intList);
		
		System.out.println("----------------AFTER ADDING ELEMENT 70 AT 2 POSITION-----------------");
		intList.add(2,70);  //(position, value to be inserted);
		System.out.println(intList);
		System.out.println("size: " + intList.size());
		
		Collections.sort(intList);
		System.out.println("----------------AFTER SORTING--------------------");
		System.out.println(intList);
		
		Collections.reverse(intList);
		System.out.println("----------------AFTER REVERSING--------------------");
		System.out.println(intList);
		
		Iterator<Integer> it = intList.iterator();
		while(it.hasNext()) {
			int no = it.next();
			System.out.println(no + " is " + (no%2==0 ? "Even" : "Odd"));
		}
		
		System.out.println("Is 50 present? " + intList.contains(50));
		
		System.out.println("Index of 33 is: " + intList.indexOf(33));//returns -1 if element is not present
		
		
		System.out.println("element at 4 position is removed " + intList.remove(4));//removes element located at index 2
		
		System.out.println("Remove 40: " + intList.remove(intList.lastIndexOf(40)));
		System.out.println(intList);
		
		//System.out.println(intList.remove(14));//ARRAY INDEX OUT OF BOUNDS ERROR
		
		System.out.println("----------------AFTER CLEARING--------------------");
		intList.clear();//clear removes all the elements from the list
		System.out.println("Is List Empty? " + intList.isEmpty());
		
		List<String> nameList = new ArrayList<String>(); //generics they are type safety
		nameList.add("Pooja");
		nameList.add("Riya");
		nameList.add("Om");
		nameList.add("Diya");	
		nameList.add("Sanket");
		System.out.println(nameList);
		Collections.sort(nameList);
		System.out.println(nameList);
		
		
	}

}
