package org.tnsif.furnitureStoreAutomation;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Discount dis = new Discount();
		
		System.out.println("*******************VIVEK FURNITURES CUSTOMER DETAILS************************");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Customer Name: ");
		String name= sc.nextLine();
		System.out.println("Enter Phone Number: ");
		long phoneNo= sc.nextLong();sc.nextLine();
		System.out.println("Enter Address: ");
		String add = sc.nextLine();
		
		//CustomerDetails cus = new CustomerDetails(name, phoneNo, add);
		
		System.out.println("Enter Bero Type(Steel Bero / Wooden Bero): ");
		String beroType = sc.nextLine();
		
	
		if(beroType.equals("Wooden Bero")) {
			System.out.println("Enter Bero Colour: ");
			String color = sc.nextLine();
			System.out.println("Enter Wood Type: ");
			String woodType = sc.nextLine();
			
			WoodenBero w = new WoodenBero(beroType, color, woodType);
			w.calculatePrice();
			double discount = dis.calculateDiscount(w);
			System.out.println("Amount needs to be paid : " + String.format("%.2f", w.getPrice() - discount));
		}
		else if(beroType.equals("Steel Bero")) {
			System.out.println("Enter Bero Colour: ");
			String color = sc.nextLine();
			System.out.println("Enter Bero Height: ");
			int height = sc.nextInt();
			
			SteelBero s = new SteelBero(beroType, color, height);
			s.calculatePrice();
			double discount = dis.calculateDiscount(s);
			System.out.println("Amount needs to be paid : " + String.format("%.2f", s.getPrice() - discount));
		}
		else {
		System.out.println("\n" +  beroType + " is an invalid bero type");
		}
	}

}
