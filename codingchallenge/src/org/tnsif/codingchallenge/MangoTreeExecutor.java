/*Darshan is so must interested in gardening and hence he plans more trees in his garden. He plans trees in a rectangular 
*fashion with the order of rows and columns & numbers the trees in a row wise order. He planted the mango tree only 
*in the first row, first column and last column. So given the tree number(t) and row and column number(n) as input your task is to find
*out whether the given tree is a mango tree or not.
*t=11 n=5
 */
package org.tnsif.codingchallenge;

import java.util.Scanner;

public class MangoTreeExecutor {
	

static void isMangoTree(int n , int t)
{
	if(t%n==0 || t%n==1 || t<=n) {
	 System.out.println("Mango Tree");
	 
	}else
		System.out.println("Not a Mango Tree");
}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of n and t: ");
		int n = sc.nextInt();
		int t = sc.nextInt();
		isMangoTree(n,t);
			

	}

}
