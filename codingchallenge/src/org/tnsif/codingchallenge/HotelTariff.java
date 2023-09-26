/* write a program to calculate hotel tariff(budget). the room rent is 20% high during a fixed season (april to june,
nov to dec). switch case I/P month=3, rent =1500, days=2*/
package org.tnsif.codingchallenge;

import java.util.Scanner;

public class HotelTariff {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the month: ");
		int month = sc.nextInt();
		System.out.println("Enter the rent: ");
		float rent = sc.nextFloat();
		System.out.println("Enter the days: ");
		int days = sc.nextInt();
		double rent2, totaltariff;
		
		switch(month){
		case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		case 9:
		case 10:
			
			System.out.println(rent*days);
			break;
		case 4: 
		case 5:
		case 6:
		case 11:
		case 12:
				//rent2 = rent * 0.2;
				 System.out.println((rent + (rent * 0.2f))*days);
				break;
			default:
				System.out.println("Invalid Input");
			}
		//System.out.println("Hotel Tariff will be: Rs. " + totaltariff);
	}
}
