// CSCI 132 : Project3
// Susan McCartney
// July 20, 2020

package Project3;

public abstract class Shape {
    // Fields
    private String color;

    // Methods: Getters and setters
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // How to make area and perimeter work with shape
    public abstract double area();

    public abstract double perimeter();

    public abstract String toString();
}