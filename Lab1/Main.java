//CSCI 132 - Lab01
//Susan McCartney
//July 01, 2020
package Lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] characters = new String[] { "Thing 1", "Thing 2", "Red Fish", "Blue Fish", "Thinks" };
        System.out.println("*** Top Five Dr.Seuss Characters ***");
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Type the new number 1: ");

        String newName = inputScanner.nextLine();
        System.out.println("You typed: " + newName);
        inputScanner.close();

        String temp = newName;
        for (int i = 0; i < characters.length; i++) {
            String temp2 = characters[i];
            characters[i] = temp;
            temp = temp2;

        }
        System.out.println("*** New Top Five ***");
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }

    }
}
