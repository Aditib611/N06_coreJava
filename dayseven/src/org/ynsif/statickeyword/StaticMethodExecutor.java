//program to demonstrate on static method
package org.ynsif.statickeyword;

public class StaticMethodExecutor {
	
	static String str="BKC";
	static float percentage=87.9f;
	//static method 
	/* 1. if any method outside the main function and if you want to access that method inside the main function make it 
	 * as static*/
	/**/
	static void displayScore(int score) {
		//System.out.println(percentage);
		System.out.println(str);
		System.out.println("Score is: " + score);
	}

	public static void main(String[] args) {
		displayScore(56);
	}

}
