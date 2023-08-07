package org.tnsif.interfacekeyword;
//program to demonstrate on interface
public interface Sony {
	/*By default all the variables inside an interface is public static final*/
	 int noofChannels = 6;
	 //By default all the method inside an interface is an abstract method
 void display();
/*java 8 provides a static and default method inside an interface*/
 //static method
 static void accept()
 {
	 System.out.println("Static method");	 
 }
 //default method
 default void show()
 {
	 System.out.println("default method");	 
 }	  
	
}
