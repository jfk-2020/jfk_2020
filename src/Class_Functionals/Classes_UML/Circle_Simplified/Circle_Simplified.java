package Class_Functionals.Classes_UML.Circle_Simplified;

public class Circle_Simplified {

    private double radius = 1.0;

    public Circle_Simplified() {
    }

    public Circle_Simplified(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return Math.PI * (radius * 2);
    }
    public String toString () {
        return "Circle[radius = " + getRadius() + "]";
    }
}
