/*Problem statement : You have been given an array of positive integers A1,A2,...,An with length N and 

 * you have to print an array of same legnth(N) where the values in the new array are the sum of every number 
 * in the array, except the number at that index.
Input:
The first line of input contains a single integer T denoting the number of test cases.
Each test cases contain two lines.First line contains N, the length of the array and second line contains N 
space separated positive integers.
Output:
For each test case, output a single array of same length.
Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤105
0 <= A[i] <= 109
Example:
Input
2
4
1 2 3 4
3
4 5 6
Output

9 8 7 6
11 10 9
Explanation

Test case 1: For the first index, the result will be 2+3+4= 9, similarly for the second, third and fourth 
index the corresponding results will be 8, 7 and 6 respectively.*/

package org.tnsif.codingchallenge;
import java.util.Scanner;

public class ArraySum {

	private static final int N = 0;
	public static int[] CalculateSum(int arr[], int N) {
		int result[] = new int[N];
		int sum =0;
		
		// Calculate the sum of all elements in the input array
		for(int i=0; i<N ; i++) {
			sum=sum+arr[i];
		}
		
		//calculate result array
		for(int i=0;i<N;i++)
		{
			result[i]= sum-arr[i];
	    }
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  no of test cases: ");
		int T = sc.nextInt();
		for(int t=0;t<T;t++)
		{
			System.out.println("Enter length of array: ");
			int N = sc.nextInt(); // Length of the array
			int arr[] = new int[N];
			
			for(int i=0;i<N;i++) {
				arr[i] = sc.nextInt();
			}
			
			int result[]=CalculateSum(arr, N);
			for(int i=0;i<N;i++) {
				System.out.println(result[i] + " ");
			}
			System.out.println();
			
		}
	}

}
