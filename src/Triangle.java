// A subclass of TwoDimShape to represent triangles
public class Triangle extends TwoDimShape {
    private String style;

    // Standard constructor
    Triangle() {
        super();
        style = "none";
    }

    // Constructor of the Triangle class.
    Triangle(String s, double w, double h){
        super(w, h, "triangle");
        style = s;
    }

    // Constructor with one argument
    Triangle(double x){
        super(x, "triangle");
        style = "shaded";
    }

    // Constructor to create an object from an object
    Triangle(Triangle ob){
        super(ob);
        style = ob.style;
    }

    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle style: " + style);
    }
}
