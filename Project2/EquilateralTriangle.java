// CSCI 132 - Project 2
// Susan McCartney
// July 13, 2020

package Project2;

public class EquilateralTriangle implements RegularPolygon {
    // fields
    private double sideLength;

    // constructor
    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double perimeter() {
        return sideLength * 3;
    }

    // 0.43301 = sqrt{3}/4
    @Override
    public double area() {
        return 0.43301 * (sideLength * sideLength);
    }

}