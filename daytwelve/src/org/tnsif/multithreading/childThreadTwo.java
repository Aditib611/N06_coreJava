/*program to demonstrate on multithreading */
package org.tnsif.multithreading;

public class childThreadTwo extends Thread{
	
		public void run() {
			System.out.println("Is 5 prime number? "+ Operations.isPrime(5));
		}
	

}
