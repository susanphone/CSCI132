//CSCI 132 - Lab 3
//Susan McCartney
//July 15, 2020

package Lab3;

public class Movie {
    // fields
    private String title;
    private int year;

    // constructor
    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    // Methods
    @Override
    public String toString() {
        return title + " (" + year + ")";
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

}