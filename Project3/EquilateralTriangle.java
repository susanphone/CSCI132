// CSCI 132 : Project3
// Susan McCartney
// July 20, 2020

package Project3;

public class EquilateralTriangle extends Shape implements RegularPolygon {
    // fields
    private double side;

    // constructor
    public EquilateralTriangle(double side) {
        this.side = side;
        setColor("White");
    }

    public EquilateralTriangle(String color) {
        side = 1.0;
        setColor(color);
    }

    // Methods: Calculate area and perimeter of an equilateral triangle
    @Override
    public double perimeter() {
        return side * 3;
    }

    // 0.43301 = sqrt{3}/4
    @Override
    public double area() {
        return 0.43301 * (side * side);
    }

    // Makes output look like list
    @Override
    public String toString() {
        return "Shape: Equilateral Triangle\n" + "Side: " + side + "\nColor: " + getColor();
    }

}