package org.tnsif.synchronization;

public class MergeSortWithTimeMeasurement {

    public static void main(String[] args) {
    	int[] arr = {38, 27, 43, 3, 9, 82, 10};

        long startTime = System.currentTimeMillis(); // Record the start time

        mergeSort(arr);

        long endTime = System.currentTimeMillis(); // Record the end time

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        double elapsedTimeInSeconds = (endTime - startTime) / 1000.0;
        System.out.println("\nTime taken: " + elapsedTimeInSeconds + " seconds");
    }

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Nothing to sort
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(left, right, arr);
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int leftLength = left.length;
        int rightLength = right.length;
        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < leftLength) {
            arr[k++] = left[i++];
        }

        while (j < rightLength) {
            arr[k++] = right[j++];
        }
    }
}