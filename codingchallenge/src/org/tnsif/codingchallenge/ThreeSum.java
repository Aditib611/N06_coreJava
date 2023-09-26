/*Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
 * Find all unique triplets in the array which give the sum of zero.
 * 


Note: The solution set must not contain duplicate triplets.

Example: Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is: [ [-1, 0, 1], [-1, -1, 2] ]*/package org.tnsif.codingchallenge;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ThreeSum {

		    public static List<List<Integer>> threeSum(int[] arr) {
		        Arrays.sort(arr);
		        int n = arr.length;
		        List<List<Integer>> ans = new ArrayList<>();
		        for (int i = 0; i < n; i++) {
		            if (arr[i] > 0) break; // Since arr[i] <= arr[l] <= arr[r], if a[i] > 0 then sum=arr[i]+arr[l]+arr[r] > 0
		            int l = i + 1, r = n - 1;
		            while (l < r) {
		                int sum = arr[i] + arr[l] + arr[r];
		                if (sum < 0) l++;
		                else if (sum > 0) r--;
		                else {
		                    ans.add(Arrays.asList(arr[i], arr[l], arr[r]));
		                    while (l+1 <= r && arr[l] == arr[l+1]) l++; // Skip duplicate nums[l]
		                    l++;
		                    r--;
		                }
		            }
		            while (i+1 < n && arr[i+1] == arr[i]) i++; // Skip duplicate nums[i]
		        }
		        return ans;
		    }
		    public static void main(String args[]) {
		    	int arr[]= {-1, 0, 1, 2, -1, -4};
		    	//threeSum(arr);
		    	System.out.println(threeSum(arr));
		    	
		    }
		

}


