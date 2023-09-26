/*Ask the customer's age and for the time on a 24-hour clock (where noon is 12.00 and 4:30 PM is 16.30).
 * The show timings are 10.15, 13.30, 18.00 and 22.00. The normal adult ticket price is $8.00, however, the 
 * adult matinee price is $5.00. Adults are those over 13 years. The normal children's ticket price is $4.00, 
 * however, the children's matinee(afternoon performance) price is $2.00. Write a program that determines the price
 *  of a movie ticket input : 16 10.15 output: $8.00*/
package org.tnsif.codingchallenge;

import java.util.Scanner;

public class MovieTicket {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		System.out.println("Enter time: ");
		float time = sc.nextFloat();

/*
		if(age>13 && (time>=10.15 && time<=11.59)) //adult 
		{
			System.out.println("$8.00");
		}
		else if(age>13 && (time>=13.30 && time<=17.59)) //adult matinee
		{
			System.out.println("$5.00");
		}
		else if(age<13 && (time>=10.15 && time<=11.59)) //children
		{
			System.out.println("$4.00");
		}
		else if(age<13 && (time>=12.00 && time<=17.59))//child matinee
		{
			System.out.println("$2.00");
		}
		else {
			System.out.println("Movie is not schedules on this time.");
		}
		*/
		//adult
		if(age>13){
			if(time>13.30 && time<=17.59)
				System.out.println("$5.00");
			else
				System.out.println("$8.00");
		}
		//children
		if(age<13){
			if(time>13.30 && time<=17.59)
				System.out.println("$2.00");
			else
				System.out.println("$4.00");
		}
		
		
	}
	}

