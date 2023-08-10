package org.tnsif.uncheckedexception;

public class ArrayIndexOutOfBoundExceptionExecutor {

	static void display(int arr[]) {
		try {
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Handled "+e);
		}
		finally {
			System.out.println("Finally block is always executed");
		}
		System.out.println("Any statement outside the Finally block is always executed");
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		display(arr);
	}

}
