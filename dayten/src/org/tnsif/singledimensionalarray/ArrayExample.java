//program to demonstrate on 1D array using compile time input.
package org.tnsif.singledimensionalarray;

public class ArrayExample {

	public static void main(String[] args) {
		//array initialization at the compile time
		int arr[] = {66, 33, 21, 6, 1};
		System.out.println(arr[1]);
		System.out.println("Array elements are: ");
		//enhanced for loop
		for(int i: arr) {  //we are storing all the value of arr in iterator i
			System.out.println(i+" ");
		}

	}

}
