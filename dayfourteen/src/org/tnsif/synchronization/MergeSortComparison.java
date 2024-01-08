package org.tnsif.synchronization;
import java.util.*;
import java.util.concurrent.*;

public class MergeSortComparison {


	//threadpool responsible for handling tasks concurrently
    private static ExecutorService threadPool = Executors.newCachedThreadPool();

    public static void main(String[] args) {
        int[] arr = {83,86,77,15,93,86,92,49,21,62,27,90,59,63,26,40,26,72,36}; // Replace with your specific input array

        //two copies created to preserve original input for both sorts
        int[] arrCopySimple = Arrays.copyOf(arr, arr.length); // Create a copy for simple merge sort
        int[] arrCopyMultithreaded = Arrays.copyOf(arr, arr.length); // Create a copy for multithreaded merge sort

        System.out.println("Input array:");
        System.out.println(Arrays.toString(arr));

        // Measure and display the time taken by simple merge sort
        long startTimeSimple = System.nanoTime();
        mergeSort(arrCopySimple);
        long endTimeSimple = System.nanoTime();
        double elapsedTimeSimpleInSeconds = (endTimeSimple - startTimeSimple) / 1e9;

        // Measure and display the time taken by multithreaded merge sort
        long startTimeMultiThreaded = System.nanoTime();
        mergeSortMultithreaded(arrCopyMultithreaded);
        long endTimeMultiThreaded = System.nanoTime();
        double elapsedTimeMultiThreadedInSeconds = (endTimeMultiThreaded - startTimeMultiThreaded) / 1e9;

        System.out.println("Sorted array using simple merge sort:");
        System.out.println(Arrays.toString(arrCopySimple)); //prints sorted array
        System.out.println("Time taken by simple merge sort: " + elapsedTimeSimpleInSeconds + " seconds");

        System.out.println("Sorted array using multithreaded merge sort:");
        System.out.println(Arrays.toString(arrCopyMultithreaded));
        System.out.println("Time taken by multithreaded merge sort: " + elapsedTimeMultiThreadedInSeconds + " seconds");
    }

    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) { //whether arr is small
            return;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid]; //1st half length
        int[] right = new int[arr.length - mid]; // 2nd half length

        //to copy elements from the original arr into the left and right arrays.
        //arr: source 0: 0th index first element in arr
        //left: destination where elements are copied
        //0: starting index i ndestination
        //no of elements to be copied
        System.arraycopy(arr, 0, left, 0, mid);
        
        //mid: starting index in arr
        //right: destination
        //0: starting posiiton in dest where copiee will be paste
        //arr.length - mid specifies the number of elements to be copied
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        //splits input arr into 2 separate arrays
       //recursive calls invoke the mergeSort method on the left and right subarrays. 
        //divides until base condition is met
        mergeSort(left);
        mergeSort(right);

        //merges the sorted left and right subarrays back into the original 
        int i = 0, j = 0, k = 0;
        // places the smaller element into the arr
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {  //if any elements from left are remaining then it adds into k
            arr[k++] = left[i++];
        }
        while (j < right.length) { 
            arr[k++] = right[j++];
        }
    }

    public static void mergeSortMultithreaded(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
      //arr: source 0: 0th index first element in arr
        //left: destination where elements are copied
        //0: starting index i ndestination
        //no of elements to be copied
        
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

     /*Two Future objects, leftSort and rightSort, are created to represent the results of submitting 
      * the mergeSort method for the left and right subarrays to the thread pool. The submit method
      *  is used to execute the sorting of these subarrays in separate threads.*/
        Future<?> leftSort = threadPool.submit(() -> mergeSort(left));
        Future<?> rightSort = threadPool.submit(() -> mergeSort(right));
// waits for the sorting of the left and right subarrays
        try {
            leftSort.get();
            rightSort.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

   /* public static int[] createRandomArray(int length) {
        int[] a = new int[length];
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(1000000);
        }
        return a;
    }*/
}
