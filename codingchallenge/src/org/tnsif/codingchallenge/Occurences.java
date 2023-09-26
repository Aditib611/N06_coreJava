package org.tnsif.codingchallenge;

/*Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

 

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false*/
import java.util.Arrays;

public class Occurences {

	
 class Solution{
		    public boolean uniqueOccurrences(int[] arr) {
		    	int[] arr1 = {1,2,2,1,1,3};
		        int[] count_array = new int[2001];
		        
		        for(int i: arr1){
		            count_array[i + 1000]++;
		        }

		        Arrays.sort(count_array);

		        for(int i=0;i<2000; i++){
		            if(count_array[i] !=0 && count_array[i] == count_array[i+1]){
		                return false;
		            }
		        }
		        return true;
		    }
		
 		}
 
		 public static void main(String[] args) {
			 
			}

}
