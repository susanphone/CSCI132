// CSCI 132 - Project 2
// Susan McCartney
// July 13, 2020

package Project2;

public class RegularPentagon implements RegularPolygon {
    // fields
    private double sideLength;

    // constructor
    public RegularPentagon(double sideLength) {
        this.sideLength = sideLength;
    }

    // methods
    // 1.72047 = 1/4(sqrt{5(5+2Sqrt{5})})... yuck!
    @Override
    public double area() {
        return 1.72047 * (sideLength * sideLength);
    }

    @Override
    public double perimeter() {
        return sideLength * 5;
    }

}