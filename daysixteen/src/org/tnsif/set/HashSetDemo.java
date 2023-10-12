package org.tnsif.set;

import java.util.HashSet;
/*Hash set is unordered unsorted*/
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> hs1=new HashSet<Integer>();
		hs1.add(4);
		hs1.add(1);
		hs1.add(9);
		hs1.add(7);
		hs1.add(3);
		System.out.println(hs1);
		hs1.add(23);
		hs1.add(12);
		
		
		HashSet<Integer> hs2=new HashSet<Integer>();
		hs2.add(4);
		hs2.add(1);
		System.out.println(	hs2.add(9));//we cannot insert element before larger number
		hs2.add(6);
		hs2.add(10);
		hs2.add(8);
		System.out.println(hs2.add(9));
		
		System.out.println("First Set : "+ hs1);
		System.out.println("Second Set : "+hs2);
		//Union
				hs2.addAll(hs1);
				System.out.println("--------UNION-----");
				System.out.println("Resultant Set : "+hs2);
				
				hs2.clear();
				hs2.add(4);
				hs2.add(1);
				hs2.add(9);
				hs2.add(6);
				hs2.add(10);
				hs2.add(8);
				System.out.println("--------------------------");
				System.out.println("First Set : "+ hs1);
				System.out.println("Second Set : "+hs2);
				
				//Set Difference Hs2-Hs1
				System.out.println("------------DIFFERENCE---------------");
				hs2.removeAll(hs1);
				System.out.println("Resultant Set : "+hs2);
				
				hs2.clear();
				hs2.add(4);
				hs2.add(1);
				hs2.add(9);
				hs2.add(6);
				hs2.add(10);
				hs2.add(8);
				System.out.println("-------------INTERSECTION--------------");
				System.out.println("First Set : "+ hs1);
				System.out.println("Second Set : "+hs2);
				
				//Set Intersection
				hs2.retainAll(hs1);
				System.out.println("Resultant Set : "+hs2);
				
		
	}
}
