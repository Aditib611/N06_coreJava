/**program to demonstrate on multithreading */
package org.tnsif.multithreading;

public class DemoOperations {

	public static void main(String[] args) {
		System.out.println("In main" + Thread.currentThread()); //Thread is a inbuilt class and currentThread is it's static method
		childThreadOne t1 = new childThreadOne();
		
		t1.start();
		//t1.start();//will give java.lang.IllegalThreadStateException 
		/*childThreadTwo t2 = new childThreadTwo();
		t2.start();
		
		try {				//background thread will wait till t1 t2 will die
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		//System.out.println("Factorial of 4 is: "+ Operations.getFactorial(4));
		//System.out.println("Is 5 prime number? "+ Operations.isPrime(5));
		//System.out.println("Is 50 prime number? "+ Operations.isPrime(50));
		System.out.println("----------------------------------------------------------------------------");//main class doesnt wait for child class to complete
	}

}
/*thread(main ,5,main)=> (Name_of_thread, priority, group of thread)*/