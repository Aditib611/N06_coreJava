//print n to 1 numbers using while loop
package org.tnsif.looping;

import java.util.Scanner;

public class WhileExecutor {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of n: ");
		int n =sc.nextInt();
		//printing n to 1
		while(n>=1) {
			System.out.print(n+ " ");
			n--;
		}
		
	}

}
