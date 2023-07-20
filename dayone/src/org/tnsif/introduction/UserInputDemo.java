//program to demonstrate on user input value
package org.tnsif.introduction;
import java.util.Scanner;
public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);//System.in = system input
		System.out.println("Enter a String: ");
		//String str1 = sc.next();
		String str1 = sc.nextLine();
		System.out.println("String is: "+ str1);
		//sc.close();
	}

}
