
package org.tnsif.codingchallenge;
import java.util.*;

public class NapoleonCake {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();  // Number of test cases
	        while (t-- > 0) {
	            int n = sc.nextInt();  // Number of layers in the cake for this test case
	            int a[] = new int[n];  // Array to store cream amounts for each layer
	            for (int i = 0; i < n; i++) {
	            	a[i] = sc.nextInt();
	            }
	            int c = a[n - 1];  // Initialize current cream amount with the last layer's cream
	            
	            StringBuilder sb = new StringBuilder();// StringBuilder sb is used to construct the output string.
	            
	            for (int i = n - 1; i >= 0; i--)  //we are counting from top to bottom
	            {
	                if (a[i] >= c)
	                {
	                	c = a[i];
	                }
	                if (c > 0 && c >= a[i]) 
	                {
	                    sb.append("1 ");
	                    c--;
	                } 
	                else 
	                	sb.append("0 ");
	            }
	            System.out.println(sb.reverse().toString().trim());  // Print the wet layers
	        }
	    }
	}

