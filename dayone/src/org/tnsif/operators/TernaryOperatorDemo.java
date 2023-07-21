package org.tnsif.operators;

import java.util.Scanner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num: ");
		int num = sc.nextInt();
		String result = (num%2==0)? "Even":"Odd";
		System.out.println("Result is: "+result);
		sc.close();

	}

}
