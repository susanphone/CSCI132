// CSCI 132 : Project3
// Susan McCartney
// July 20, 2020

package Project3;

public class Rectangle extends Shape {
    // Fields
    protected double width;
    protected double height;

    // Constructor
    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        setColor(color);
    }

    public Rectangle(String color) {
        setColor(color);
    }

    // Default values
    public Rectangle(double width, double height) {
        this.width = 1.0;
        this.height = 1.0;
        setColor("White");
    }

    // Methods: How to calculate area and perimeter of any rectangle
    @Override
    public double perimeter() {
        return (2 * width) + (2 * height);
    }

    @Override
    public double area() {
        return width * height;
    }

    // Makes output look like list
    @Override
    public String toString() {
        return "Shape: Rectangle\n" + "Width: " + width + "\nHeight: " + height + "\nColor: " + getColor();
    }
}