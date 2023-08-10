
//program to demonstrate on arrays of objects

package org.tnsif.singledimensionalarray;

import java.util.Scanner;
//driver class
public class ArraysOfObjectsDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employees arr[] = new Employees[3];
		arr[0] = new Employees(101, "Sara Bansode", 67522.45);
		arr[1] = new Employees(102, "Naira Jadhav", 45892.45);
		arr[2] = new Employees(103, "Prachi Bagul", 45362.45);
		for(int i=0;i<3;i++) {
			System.out.println(arr[i].getID()+ " " + arr[i].getName()+ " " + arr[i].getSalary());
		}
		
	}

}
