public class Rectangle extends TwoDimShape {
    // Standard constructor
    Rectangle() {
        super();
    }

    // Constructor of the Rectangle class.
    Rectangle(double w, double h) {
        super(w, h, "rectangle"); // calling the superclass constructor
    }

    //Square constructor
    Rectangle(double x) {
        super(x, "rectangle (square)"); // calling the superclass constructor
    }

    // Constructor to create an object from an object
    Rectangle(Rectangle ob){
        super(ob); // passing an object to the constructor of class TwoDimShape
    }
    boolean isSquare(){
        if (getWidth() == getHeight()) return true;
        return false;
    }
    double area(){
        return getWidth() * getHeight();
    }
}
