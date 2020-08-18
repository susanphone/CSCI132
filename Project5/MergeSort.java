// CSCI 132 Project 5
// Susan McCartney
// August 03, 2020
package Project5;

import java.util.ArrayList;

public class MergeSort {

    public static void mergeSort(ArrayList<String> S, StringLengthComparator comp) {
        // Determine the size of our arraylist
        int n = S.size();

        // Base Case
        // if our list is only one element (or none), return
        if (n < 2) return;

        // Calculate the midpoint of our arraylist
        int mid = n/2;
        
        // Create two new arraylists, separated at the midpoint
        ArrayList<String> S1 = new ArrayList<String>(S.subList(0, mid));
        ArrayList<String> S2 = new ArrayList<String>(S.subList(mid, n));

        // Recursively run mergeSort on our sublists
        mergeSort(S1, comp);
        mergeSort(S2, comp);

        // Finally, merge the two sorted halves together
        merge(S1, S2, S, comp);
        }


    private static <K> void merge(ArrayList<String> S1, ArrayList<String> S2, ArrayList<String> S, StringLengthComparator comp) {
        int i = 0, j = 0;

        // Iterate until we have nothing left to merge
        while (i + j < S.size()) {

            // if J is the last element of S2, or
            // i is not the last element, and j is longer than i, then
            // insert i before j
            if (j == S2.size() || (i < S1.size() && comp.compare(S1.get(i), S2.get(j)) < 0))
                S.set(i+j, S1.get(i++));
            else
                S.set(i+j, S2.get(j++));
        }
    }
}
