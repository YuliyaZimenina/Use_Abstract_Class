public class Circle extends TwoDimShape {

    // Standard constructor
    Circle() {
        super();
    }

    // Constructor of the Circle class.
    Circle(double x) {
        super(x, "circle");
    }

    // Constructor to create an object from an object
    Circle(Circle ob) {
        super(ob);
    }

    double area() {
        return (getWidth() / 2) * (getWidth() / 2) * 3.1416;
    }
}
