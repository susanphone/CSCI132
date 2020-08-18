//CSCI 132 - Lab 3
//Susan McCartney
//July 15, 2020

package Lab3;

import java.util.Arrays;

public class GenericSwapper {

    // Set T as the generic type and use try catch to catch for index out of
    // bounds
    public static <T> void swap(T[] data, int a, int b) {
        try {
            T temp = data[a];
            data[a] = data[b];
            data[b] = temp;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No swap happened because a requested index does not exist.");
        }

    }

    public static void main(String[] args) {

        // Test integers and swap index 0 and 9
        Integer[] myIntegers = new Integer[10];
        for (int i = 0; i < myIntegers.length; i++) {
            myIntegers[i] = (i + 1) * 5;
        }
        System.out.println(Arrays.toString(myIntegers));
        GenericSwapper.swap(myIntegers, 0, 9);
        System.out.println(Arrays.toString(myIntegers));

        // Test strings and swap index 0 and 9
        String[] myStrings = new String[10];
        for (int i = 0; i < myStrings.length; i++) {
            myStrings[i] = "bird " + i;
        }
        System.out.println(Arrays.toString(myStrings));
        GenericSwapper.swap(myStrings, 0, 9);
        System.out.println(Arrays.toString(myStrings));

        // Test movies and swap index 0 and 9
        Movie[] myMovies = new Movie[10];
        for (int i = 0; i < myMovies.length; i++) {
            myMovies[i] = new Movie("Harry Potato " + i, 2000 + (i * 2));
        }
        System.out.println(Arrays.toString(myMovies));
        GenericSwapper.swap(myMovies, 0, 9);
        System.out.println(Arrays.toString(myMovies));
    }

}
