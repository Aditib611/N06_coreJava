//program to demonstrate on default and parameterized constructor  
package org.tnsif.classandobject;
//class declaration
public class Library {
	//public data members
	public long noOfBooks;
	public String AuthorName;
	public String bookName;
	public double price;
	//Default Constructor
	public Library() {
		System.out.println("Default Constructor");
		// TODO Auto-generated constructor stub
	}
	//Parameterized Constructor
	public Library(long noOfBooks, String authorName, String bookName, double price) {
		super();
		this.noOfBooks = noOfBooks;
		this.AuthorName = authorName;
		this.bookName = bookName;
		this.price = price;
		System.out.println("Parameterized Constructor");
	}
	@Override
	public String toString() {
		return "Library [noOfBooks=" + noOfBooks + ", AuthorName=" + AuthorName + ", bookName=" + bookName + ", price="
				+ price + "]";
	}
	
	
}
