package org.tnsif.uncheckedexception;
/*program to demonstrate on when finally block is not executed*/
public class FinalyBlockNotExecutedExecutor {
	static void display(int arr[]) {
		try {
			System.out.println(arr[4]);
			/*if try and catch block contains a System.exit(0); after that exception code line, then finally block does 
			 * not execute*/
			//System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Handled "+e);
			//System.exit(0);
		}
		finally {
			/*When finally block contains an exception code like System.out.println(13/0); then finally block does not 
			 * execute */
			System.out.println(13/0);
			System.out.println("Finally block is always executed");
		}
		System.out.println("Any statement outside the Finally block is always executed");
		
	}
	
	public static void main(String[] args) {
		int arr[] = {76, 89, 52};
		display(arr);

	
}
}
