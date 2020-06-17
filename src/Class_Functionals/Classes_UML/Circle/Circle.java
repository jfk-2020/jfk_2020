package Class_Functionals.Classes_UML.Circle;

public class Circle {

    private double radius = 1.0;
    private String color = "red";

    public Circle () {}

    public Circle (double radius) {
        this.radius = radius;
    }
    public Circle (double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setRadius(double radius) {
        //this.radius = radius;
    }

    public void setColor(String color) {

    }

    public String toString() {
        return "Circle[radius = " + getRadius() + ", color = " + getColor();
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
