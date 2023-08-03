//program to demonstrate on final variable
package org.tnsif.finalkeyword;

public class FinalVariable {
	/* final variable must be initialized during declaration*/
	 int x=5;
	 
	 final float SALARY = 4523.65f;
	 
	 void print() {
		 //we can't change the value of the final variable
		 //SALARY = 7859.63f;
		 System.out.println("Salary is: "+SALARY);
	 }
}
