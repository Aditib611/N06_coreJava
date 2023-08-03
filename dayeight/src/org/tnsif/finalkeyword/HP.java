package org.tnsif.finalkeyword;

public class HP extends Laptop{
	final String processor="Intel I7";
	//final method
	/*we can't override final method
	void display() {
		System.out.println(processor);
	}*/
	
	void display(String processor) {
		System.out.println(processor);
	}
}

