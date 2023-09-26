/*Mary is good in mathematics. She is always playful and has a good memory. When her friend Pinky tells n numbers, she has a habit of telling all those numbers in the reverse order of what she told. Please help her friend to find if the order in which Mary says are correct or not.
Sample Input 1:

Enter the value of n
5
Numbers said by Pinky
12
78
34
21
56
Numbers said by Mary
56
21
34
78
12

Sample Output 1: 

Yes, it is in reverse order
*/package org.tnsif.codingchallenge;
import java.util.*;
public class GuessReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the numbers said by Pinky:");
		int[] nums = new int[n];
		for(int i=0; i<n ;i++) {
		 nums[i] = sc.nextInt();
		}
		
		System.out.println("Enter the numbers said by Mary:");
		int[] arr = new int[n];
		for(int i=0; i<n ;i++) {
		 arr[i] = sc.nextInt();
		}
		if (IsReverse(nums, arr)) {
            System.out.println("Yes, it is in reverse order");
        } else {
            System.out.println("No, it is not in reverse order");
        }

	}

	public static Boolean IsReverse(int[] nums, int[] arr) {
		 int n = nums.length;
	        for (int i = 0; i < n; i++) {
	            if (nums[i] != arr[n - i - 1]) {
	                return false;
	            }
	        }
	        return true;
		
	}
		
		
}

