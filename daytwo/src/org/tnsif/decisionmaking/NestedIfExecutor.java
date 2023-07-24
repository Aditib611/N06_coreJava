//program to demonstrate on bunjee jumping using nested if
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIfExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Enter your weight: ");
		int weight = sc.nextInt();
		if(age>=12) {
			if(weight>=40) {
				System.out.println("Eligible for bunjee jumping.");
				if(weight>110)
				{
					System.out.println("Extra ropes will be added...");
				}
			}
			else {
				System.out.println("Not eligible");//for weight criteria
			}
		}else {
			System.out.println("Not eligible");//for age criteria
		}
		
		
	}

}
