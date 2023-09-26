/*Ask a user for their birth year encoded as 2 digits (like "02") and for the current year also encoded as 2 digits 
 * (like "23").Write a program to find the user's current age in years. 
 */
 
package org.tnsif.codingchallenge;

import java.util.Scanner;

public class AgeCalculatorExecutor {
	
	public static void ageCalculator(int birthyr, int curryr) {
		if(curryr > birthyr) {
			System.out.println(curryr - birthyr);
		}else {
			System.out.println((100-birthyr)+ curryr);
		}
		
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter birth year and current year: ");
		
		
		int birthyr = sc.nextInt();
		int curryr = sc.nextInt();
		ageCalculator(birthyr, curryr);
		

	}

}
