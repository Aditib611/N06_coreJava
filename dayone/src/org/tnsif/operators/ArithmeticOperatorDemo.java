//program to demonstrate arithmetic operator
package org.tnsif.operators;

import java.util.Scanner;

public class ArithmeticOperatorDemo {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num 1: ");
		int num1= sc.nextInt();
		System.out.println("Enter num 2: ");
		int num2= sc.nextInt();
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
	}

}
