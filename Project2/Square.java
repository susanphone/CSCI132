// CSCI 132 - Project 2
// Susan McCartney
// July 13, 2020

package Project2;

public class Square implements RegularPolygon {
    // fields
    private double sideLength;

    // constructor
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double perimeter() {
        return sideLength * 4;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }

}