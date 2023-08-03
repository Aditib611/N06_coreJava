//program to demonstrate on final method
package org.tnsif.finalkeyword;

//parent class;

/*final class cannot be inherit from child class */
//public final class Laptop {

public  class Laptop {
	
	final String processor="Intel I5";
	//final method
	void display() {
		System.out.println(processor);
	}
}
