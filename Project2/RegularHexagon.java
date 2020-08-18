// CSCI 132 - Project 2
// Susan McCartney
// July 13, 2020

package Project2;

public class RegularHexagon implements RegularPolygon {
    // fields
    private double sideLength;

    // constructor
    public RegularHexagon(double sideLength) {
        this.sideLength = sideLength;
    }

    // methods
    // 2.59807 = (3*sqrt{3})/2
    @Override
    public double area() {
        return 2.59807 * (sideLength * sideLength);
    }

    @Override
    public double perimeter() {
        return sideLength * 6;
    }
}