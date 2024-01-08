package org.tnsif.synchronization;
import java.util.concurrent.*;
public class MergeSortMultiThreaded {
	private static ExecutorService threadPool = Executors.newCachedThreadPool();
	public static void main(String[] args) {
		int[] arr = {5, 2, 8, 4, 1, 9, 3, 7, 6};

        long startTime = System.currentTimeMillis(); // Record the start time

        mergeSort(arr, 0, arr.length - 1);

        long endTime = System.currentTimeMillis(); // Record the end time

        for (int num : arr) {
            System.out.print(num + " ");
        }

        double elapsedTimeInSeconds = (endTime - startTime) / 1000.0;
        System.out.println("\nTime taken: " + elapsedTimeInSeconds + " seconds");

	}


	 public static void mergeSort(int[] arr, int low, int high) {
		 if (low < high) {
		 int mid = (low + high) / 2;
		 // Submit left and right subarray sorting tasks to the thread pool
		 Future<?> left = threadPool.submit(new SortTask(arr, low, mid));
		 Future<?> right = threadPool.submit(new SortTask(arr, mid + 1, high));
		 try {
		 // Wait for the tasks to complete
		 left.get();
		 right.get();
		 } catch (InterruptedException | ExecutionException e) {
		 e.printStackTrace();
		 }
		 // Merge the sorted subarrays
		 merge(arr, low, mid, high);
		 }
		 }
		 public static void merge(int[] arr, int low, int mid, int high) {
		 int[] temp = new int[high - low + 1];
		 int i = low, j = mid + 1, k = 0;
		 // Merge the two subarrays in sorted order
		 while (i <= mid && j <= high) {
		 if (arr[i] <= arr[j]) {
		 temp[k++] = arr[i++];
		 } else {
		 temp[k++] = arr[j++];
		 }
		 }
		 // Copy remaining elements from the left subarray
		 while (i <= mid) {
		 temp[k++] = arr[i++];
		 }
		 // Copy remaining elements from the right subarray
		 while (j <= high) {
		 temp[k++] = arr[j++];
		 }
		 // Copy the merged elements back to the original array
		 for (i = low, k = 0; i <= high; i++, k++) {
		 arr[i] = temp[k];
		 }
		 }
		 // Runnable class representing a sorting task for a subarray
		 static class SortTask implements Runnable {
		 private int[] arr;
		 private int low, high;
		 SortTask(int[] arr, int low, int high) {
		 this.arr = arr;
		 this.low = low;
		 this.high = high;
		 }
		 @Override
		 public void run() {
		 // Sort the subarray using merge sort algorithm
		 mergeSort(arr, low, high);
		 }
		 }
}
