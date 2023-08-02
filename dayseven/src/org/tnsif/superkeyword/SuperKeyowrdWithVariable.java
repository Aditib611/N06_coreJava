//program to demonstrate on super keyword with variable
package org.tnsif.superkeyword;

class Building{
	
	String name="Green Meadows";
	int floors=23;
}

class Flat extends Building{
	String name="Aarti Shrawage";
	void print()

	{	/*if parent class and child class variables are same and if you want to access parent class variable 
	inside the child class, use (super.varibale name;)*/
		System.out.println(super.name);
		System.out.println(name);
	}
}

public class SuperKeyowrdWithVariable {

	public static void main(String[] args) {
		
		Flat f = new Flat();
		f.print();
		
	}

}
