// Creating an abstract class
abstract class TwoDimShape {
    private double width;
    private double height;
    private String name;

    // Standard constructor
    TwoDimShape(){
        width = height = 0.0;
        name = "none";
    }

    // Constructor with parameters
    TwoDimShape(double w, double h, String n){
        width = w;
        height = h;
        name = n;
    }

    // The constructor for an object with the same width and height
    TwoDimShape(double x, String s){
        width = height = x;
    }

    // Constructor to create an object from an object
    TwoDimShape(TwoDimShape ob){
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Methods for accessing class variables
    double getWidth(){
        return width;
    }

    double getHeight(){
        return height;
    }

    void setWidth(double w){
        width = w;
    }

    void setHeight(double h){
        height = h;
    }

    String getName(){
        return name;
    }

    // Creating an abstract method area().
    abstract double area();
}
