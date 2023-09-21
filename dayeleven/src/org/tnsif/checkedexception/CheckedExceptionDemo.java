package org.tnsif.checkedexception;//all user defined exceptions are checked exceptions(compile time exception)

import java.io.FileInputStream;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
		FileInputStream f = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Desktop\\hello.txt");
		System.out.println("File exists!!");
		
		}
		catch(Exception e) {
			System.out.println("Exception Handled " + e);
		}
	}

}
