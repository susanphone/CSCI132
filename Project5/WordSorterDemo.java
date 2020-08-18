// CSCI 132 Project 5
// Susan McCartney
// August 03, 2020
package Project5;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;

public class WordSorterDemo {
    public static void main (String [] args) {
        // Create an arraylist to hold words from the text file
        ArrayList<String> words = new ArrayList<String>();
        
        // Read in the txt file
        try {
        	// Scanner object is constructed with new File() for file input
            Scanner fileInput = new Scanner(new File("Project5/Housman.txt"));
            while (fileInput.hasNext())	// check for next token
            {
                // Grabbing next word, lowercasing it, and replacing all special
                // characters with nothing
                String word = fileInput.next().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
                
                // Adds the word to the arraylist
                words.add(word);
            }
            fileInput.close();
        } 
        catch (FileNotFoundException exc){
            // If the file is not found, the program will stop
            System.out.println("There was a problem opening the input file");
            return;
        }
        
        // Constructing a new comparator
        StringLengthComparator compare = new StringLengthComparator();
        
        // Initiate our mergesort method and sort by the length of each word
        MergeSort.mergeSort(words, compare);

        try
        {
        	// Create a variable of type PrintWriter to store userInput to a file
            PrintWriter outputFile = new PrintWriter (new FileWriter ("output.txt"));

            // Iterate over each word in the words ArrayList
            for (String word : words) {
                // Print each word onto a new line of the file
                outputFile.println(word);
            }
            outputFile.close();
        }
        catch (IOException exc)
        {
            // If file is unwritable, the program will stop
            System.out.println("There was a problem opening the file for output");
            return;
        }
    }

    
}