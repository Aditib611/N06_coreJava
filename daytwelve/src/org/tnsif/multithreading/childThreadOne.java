/**program to demonstrate on multithreading */
package org.tnsif.multithreading;

public class childThreadOne extends Thread{
	public void run() {
		System.out.println("Factorial of 5 is "+ Operations.getFactorial(5));
	}

}
