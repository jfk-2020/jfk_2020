package Class_Functionals.Circle;

public class Circle {

    private int radius;

    public Circle(int x) {
        radius = x;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

