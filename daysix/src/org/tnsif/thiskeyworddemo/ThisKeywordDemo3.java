//inside default we passed parameterized constructor
package org.tnsif.thiskeyworddemo;


class team{
	int size;
	team(){
		
		this(7);
		System.out.println("Default Constructor");
	}
	
	team(int size){
		System.out.println("Parameterized Constructor: " + size);
	}
}

public class ThisKeywordDemo3 {

	public static void main(String[] args) {
		team t = new team();

	}

}
