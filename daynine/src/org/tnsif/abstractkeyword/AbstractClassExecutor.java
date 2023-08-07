package org.tnsif.abstractkeyword;

public class AbstractClassExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*we can't create object for abstract class*/
		//Sandwich s =new Sandwich();
		CheeseCornSandwich c = new CheeseCornSandwich();
		c.prepare();
		c.showRecipe();
		c.prepare(6); //overloading
	}

}
