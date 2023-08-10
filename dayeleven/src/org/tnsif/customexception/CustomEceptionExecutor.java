package org.tnsif.customexception;
//program to demonstrate on custom exception
import java.util.Scanner;

public class CustomEceptionExecutor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userid = sc.nextLine();
        String password = sc.nextLine();
        
        try {
        if(userid.equals("aditibhavsar26@gmail.com") && password.equals("Pass@123")) 
        {
        	System.out.println("Credentials are Matched");
        }
        else {
        	throw new LoginCredentials("Invalid Credentials");
        }
       }
        catch(LoginCredentials e) {
        	System.out.println("Exception Handled " + e );
        }

	}

}
