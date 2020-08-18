// CSCI 132 Lab 02
//Susan McCartney
// July 08, 2020

package Lab2;

import java.util.Scanner;

public class AnimalDemo {
    public static void main(String[] args) {
        // two examples print first then program prompts for new animal
        Animal myAnimal3 = new Animal("Jeffrey", 12, "Hummingbird");
        Animal myAnimal2 = new Animal("", 10, "");
        System.out.println(myAnimal3);
        System.out.println();
        System.out.println(myAnimal2);
        System.out.println();
        // Set up input for name, age, and species of animal
        Scanner scanInput = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanInput.nextLine();

        System.out.print("Enter age: ");
        int age = scanInput.nextInt();

        System.out.print("Enter species: ");
        String species = scanInput.next();

        scanInput.close();

        Animal newAnimal = new Animal(name, age, species);

        // print out user's inputs for name, age, and species
        System.out.println();
        System.out.println(newAnimal);

    }
}