// CSCI 132 : Project3
// Susan McCartney
// July 20, 2020

package Project3;

public class Square extends Rectangle implements RegularPolygon {
    // constructor use Super because of Rectangle
    public Square(double side) {
        super(side, side);
        setColor("White");
    }

    public Square(String color) {
        super(1.0, 1.0);
        setColor(color);
    }

    // Methods: How to calculate area and perimeter of a square
    @Override
    public double perimeter() {
        return width * 4;
    }

    @Override
    public double area() {
        return width * height;
    }

    // Makes output look like list
    @Override
    public String toString() {
        return "Shape: Square\n" + "Side: " + width + "\nColor: " + getColor();
    }
}