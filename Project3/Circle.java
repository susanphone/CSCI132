// CSCI 132 : Project3
// Susan McCartney
// July 20, 2020

package Project3;

public class Circle extends Shape {
    // Fields
    private double radius;
    final double pi = 3.14159;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
        setColor("White");
    }

    public Circle(String color) {
        this.radius = 1.0;
        setColor(color);
    }

    // Methods: calculate area and perimeter of a circle
    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public double area() {
        return pi * (radius * radius);
    }

    // Makes output look like list
    @Override
    public String toString() {
        return "Shape: Circle\n" + "Radius: " + radius + "\nColor: " + getColor();
    }

}