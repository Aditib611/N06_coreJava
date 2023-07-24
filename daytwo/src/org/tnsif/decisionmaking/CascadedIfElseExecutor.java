//program to demonstrate on cascaded if else statement
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class CascadedIfElseExecutor {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Age 1: ");
		int age1=sc.nextInt();
		System.out.println("Enter Age 2: ");
		int age2=sc.nextInt();
		System.out.println("Enter Age 3: ");
		int age3=sc.nextInt();
		if(age1>age2 && age1>age3)
		{
			System.out.println("Age 1 is greater: "+age1);
		}
		else if(age2>age1 && age2>age3) {
			System.out.println("Age 2 is greater: "+age2);
		}
		else {
			System.out.println("Age 3 is greater: "+age3);
		}
		
		
		

	}

}
