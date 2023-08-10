package org.tnsif.uncheckedexception;

import java.util.Scanner;

public class ArithmeticExceptionExecutor {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		//try block contains an exception code
		try {
			System.out.println(x/y);
		}
		//catch block is used to handle that exception
		catch(Exception e) {
			System.out.println("Exception Handled "+e);
		}
	}

}
