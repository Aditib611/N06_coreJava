package org.tnsif.uncheckedexception;
/*program to demonstrate on catch block with mutliple exception classs*/
public class CatchBlockDemo {
	static void print(int arr[]) {
		try {
			System.out.println(arr[4]);
		}
		// we can use multiple catch block in the program
		
		//child class (first priority)
		catch(ArithmeticException  | NullPointerException e) {
			System.out.println("Exception Handled "+e);
			//System.exit(0);
		}
		//parent class i.e Exception
		catch(Exception e) {
			System.out.println(e);
		}
	}
	

	public static void main(String[] args) {
		int arr[] = {12,3,14} ;
		print(arr);
	}

}
