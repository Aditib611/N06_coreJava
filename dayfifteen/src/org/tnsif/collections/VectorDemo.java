package org.tnsif.collections;
/*Vector is thread safe meaning that only one thread can access vector if collection is being shared with multiple resources use vector*/
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		v.add(20);
		v.add(10);
		v.add(30);
		v.add(45);
		v.add(69);
		System.out.println(v);

	}

}
