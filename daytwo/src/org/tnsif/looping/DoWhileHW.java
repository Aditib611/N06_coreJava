//program to demonstrate how many digits in given no using do while 
package org.tnsif.looping;

import java.util.Scanner;

public class DoWhileHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num= sc.nextInt();
		int total_digits=0;
		
		do {
			total_digits++;
			num = num/10;
	
		}while(num!=0);
		System.out.println("There are total "+ total_digits + " digits"
				+ ""
				+ " in a given number.");
	}

}
