//program to demonstrate on mutlithreading
//By default every java program is a singlethreaded program
//we can access static methods using className and non-static methods using objects.
//Thread is inbuilt class available in java.lang package
package org.tnsif.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();//accessing background thread (main)
		System.out.println(t.getName());
		System.out.println(t);//invokes toString method of Object class
		System.out.println("-------------------------");

	}

}
