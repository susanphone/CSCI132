// CSCI 132 : Project3
// Susan McCartney
// July 20, 2020

package Project3;

// Below is a description of the data that should give the output commented about each example:

public class ShapeDemo {
    public static void main(String[] args) {

        // Square, White, 3.0, 9.0, 12.0
        System.out.println();
        // System.out.println("Shape: Square");
        Shape mySquare = new Square(3.0);
        System.out.println(mySquare);
        System.out.println("Area: " + mySquare.area() + "\nPerimeter: " + mySquare.perimeter());
        System.out.println();

        // Circle, 3.0, Area, Perimeter, "Periwinkle"
        // System.out.println("Shape: Circle");
        Circle myCircle = new Circle(3.0);
        System.out.println(myCircle);
        myCircle.setColor("Periwinkle");
        System.out.println("Area: " + myCircle.area() + "\nPerimeter: " + myCircle.perimeter());
        System.out.println();

        // Circle is a Square? NO, a circle is not a square.
        // Circle, 1.0, pi, 2pi, "White"

        // Circle mySquare2 = new Square(1.0);
        // System.out.println(mySquare2);
        // System.out.println("Radius: 1.0\n" + "Area: " + mySquare2.area() +
        // "\nPerimeter: " +
        // mySquare2.perimeter());

        // Circle, Blue, 2.0, 4pi, 2pi2
        Circle myCircle2 = new Circle(2.0);
        System.out.println(myCircle2);
        myCircle.setColor("Blue");
        System.out.println("Area: " + myCircle2.area() + "\nPerimeter: " + myCircle2.perimeter());
        System.out.println();

        // Rectangle, 3.5, 4.0, 14.0, 15.0, "Periwinkle"
        Shape myRectangle = new Rectangle(3.5, 4.0);
        System.out.println(myRectangle);
        myRectangle.setColor("Periwinkle");
        System.out.println("Area: " + myRectangle.area() + "\nPerimeter: " + myRectangle.perimeter());
        System.out.println();

        // Rectangle is a Square? YES in this case!
        // Square, 1.0, 1.0, 4.0, Yellow
        Shape mySquare3 = new Square("Yellow");
        System.out.println(mySquare3);
        System.out.println("Area: " + mySquare3.area() + "\nPerimeter: " + mySquare3.perimeter());
        System.out.println();

        // Square is a Rectangle? YES!
        // Rectangle, 3.0, 4.0, 12.0, 14.0, Green
        Shape myRectangle2 = new Rectangle(3.0, 4.0, "Green");
        System.out.println(myRectangle2);
        System.out.println("Area: " + myRectangle2.area() + "\nPerimeter: " + myRectangle2.perimeter());
        System.out.println();

        // Equilateral Triangle, 1.0, 0.433, 3.0, Pink
        Shape myTriangle = new EquilateralTriangle("Pink");
        System.out.println(myTriangle);
        System.out.println("Area: " + myTriangle.area() + "\nPerimeter: " + myTriangle.perimeter());
        System.out.println();

        // A Triangle is not a circle!

        // EquilateralTriangle myTriangle2 = new Circle(2.0, " ");
        // System.out.println(myTriangle2);
        // System.out.println("Area: " + myTriangle2.area() +
        // "\nPerimeter: " +
        // myTriangle2.perimeter());

        // Rectangle, 3.0, 3.0, 9.0, 12.0, Orange
        Shape myRectangle3 = new Square(3.0);
        System.out.println(myRectangle3);
        myRectangle3.setColor("Orange");
        System.out.println("Area: " + myRectangle3.area() + "\nPerimeter: " + myRectangle3.perimeter());
        System.out.println();

        // A circle is a shape, but a shape isn't a circle

        // Circle myShape = new Shape(5.25);
        // System.out.println(myShape);
        // System.out.println("Area: " + myShape.area() + "\nPerimeter: " +
        // myShape.perimeter());

        // A square is a shape but a shape isn't a square

        // Square myShap2 = new Shape(4.0);
        // System.out.println(myShap2);
        // myShap2.setColor("Magenta");
        // System.out.println("Area: " + myShape2.area() + "\nPerimeter: " +
        // myShape2.perimeter());

    }
}