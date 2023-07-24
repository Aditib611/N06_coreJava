//program to demonstrate on increment and decrement operator
package org.tnsif.operators;

public class IncrementDecrementOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=23, y=6;
		int result1 = x++ + ++y;  //x++=>23 and ++y=7 23+7
		System.out.println(result1);
		System.out.println(x);//24
		System.out.println(y);//7
		int result2 = x-- + --y;  //x--=>24 and --y=6 24+6
		System.out.println("result2 =" + result2);
		System.out.println(x);
		System.out.println(y);
	}

}
