package org.ynsif.statickeyword;

public class Dog extends Animal {
	void eat() 
	{
		System.out.println("eating");
	}
	
    /*we cam't override any static method
	void run() 
    {
    	System.out.println("running");
   }*/
	
	void run() 
    {
		super.run();
    	System.out.println("running");
   }
}
