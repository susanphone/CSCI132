// CSCI 132 Project 5
// Susan McCartney
// August 03, 2020
package Project5;

public class StringLengthComparator {

    // compares string a to string b
    // if a is longer, return 1, 
    // if b is longer, return -1,
    // if a and b are the same length, return 0
    public int compare(String a, String b) {
        if (a.length() < b.length()) return -1;
        else if (a.length() == b.length()) return 0;
        else return 1;
    }
    
}