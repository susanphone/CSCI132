// CSCI 132 Lab 02
//Susan McCartney
// July 08, 2020

package Lab2;

public class Animal {
    // Fields
    private String name;
    private int age;
    private String species;

    // Constructor
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // Getters: retrieve name, age and species from user
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    // Setters: take user input and replace name, age, and species
    // with input from user
    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setSpecies(String newSpecies) {
        species = newSpecies;
    }

    // in order to not print the memory address, override toString and return
    // strings and variables
    @Override
    public String toString() {
        String nameToString = name;
        String speciesToString = species;
        if (nameToString == "") {
            nameToString = "Unnamed";
        }
        if (speciesToString == "") {
            speciesToString = "Unknown";
        }

        return "Name: " + nameToString + "\nAge: " + age + "\nSpecies: " + speciesToString;
    }

}
