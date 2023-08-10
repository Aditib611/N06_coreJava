package org.tnsif.singledimensionalarray;
import java.util.Arrays;
/*program to demonstrate on runtime input and printing the largest element of the array*/
import java.util.Scanner;

public class ArrayRuntime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter the total no of elements in array: ");
		n = sc.nextInt();
		int arr[]= new int[n];
		
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("The elements of array are : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	//	System.out.println("Enter the element you want to find index of: ");
		//int j = sc.nextInt();
		//System.out.println("The index of the element" + j + "is:" + arr[j]);
			//System.out.println(arr[j]);
		int max=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("The largest element is "+max);
		
		Arrays.sort(arr);  //Arrays is a class
		System.out.println("Sorted elements are: ");
		//enhanced for loop
		for(int i:arr) {
			System.out.print(i + " ");
		}
		

	}

}
