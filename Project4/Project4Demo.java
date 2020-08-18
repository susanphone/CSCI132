// CSCI 132 - Project 4
// Susan McCartney
// July 27, 2020
package Project4;

import java.util.Random;
import java.util.Arrays;

// If you had to choose which search algorithm was faster, 
// even with really big numbers and small numbers, the binary 
// search is faster and that's what I would use to get paid the big bucks.

public class Project4Demo {
    public static void main(String[] args) {
        int size = 5000;
        int[] data = testArray(size);
        int target = 5;

        long startTime1 = System.currentTimeMillis();
        boolean found = linearSearch(data, target, size);
        long endTime1 = System.currentTimeMillis();
        long time1 = endTime1 - startTime1;
        System.out.println("**** Linear Search***");
        if (found) {
            System.out.println("Input: n = " + size + ", Target: " + target + " found in " + time1 + " milliseconds\n");
        } else {
            System.out.println(
                    "Input: n = " + size + ", Target: " + target + " not found in " + time1 + " milliseconds\n");

        }

        int low = 0;
        int high = size - 1;
        Arrays.sort(data);
        long startTime2 = System.currentTimeMillis();
        found = binarySearch(data, target, low, high);
        long endTime2 = System.currentTimeMillis();
        long time2 = endTime2 - startTime2;
        System.out.println("**** Sort + Binary Search***");
        if (found) {
            System.out.println("Input: n = " + size + ", Target: " + target + " found in " + time2 + " milliseconds\n");
        } else {
            System.out.println(
                    "Input: n = " + size + ", Target: " + target + " not found in " + time2 + " milliseconds\n");

        }
    }

    public static int[] testArray(int n) {
        Random rand = new Random();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = rand.nextInt(n);
        }
        return intArray;
    }

    // asymptotic runtime is O(n)
    public static boolean linearSearch(int[] data, int target, int size) {
        for (int i = 0; i < size; i++) {
            if (data[i] == target) {
                return true;
            }
        }
        return false;
    }

    // asymptotic runtime is O(log n)
    public static boolean binarySearch(int[] data, int target, int low, int high) {
        // base case
        if (low > high)
            return false;
        // recursive case
        else {
            int mid = (low + high) / 2;
            if (target == data[mid])
                return true;
            else if (target < data[mid])
                return binarySearch(data, target, low, mid - 1); // recur left of the middle
            else {
                return binarySearch(data, target, mid + 1, high); // recur right of the middle
            }
        }

    }

}