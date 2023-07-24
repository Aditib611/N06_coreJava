//program to demonstrate on if else statement
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseExecutor {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		System.out.println("Enter Weight: ");
		int weight=sc.nextInt();
		if(age>18 && weight>50)
		{
			System.out.println("Eligible to donate blood.");
		}else {
			System.out.println("Not Eligible.");
		}
		
		
	}

}
