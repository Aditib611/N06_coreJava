//program to demonstrate on switch case
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchExecutor {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter song no: ");
		int songno = sc.nextInt();
		
		switch(songno) 
		{
			case 1: 
				System.out.println("Peaches");
				break;
			case 2 :
				System.out.println("Taki Taki");
				break;
			case 3 :
				System.out.println("Waka Waka");
				break;
			default:
				System.out.println("Invalid choice");
				
		}
	}

}
//if u are not using break it is called fall through , jumps to next case also
