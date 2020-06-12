package Class_Functionals.Circle;

public class Circle {
    private int radius;

    public Circle(int radius) {
        radius = radius;

    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getArea() {
        return 2 * Math.PI * Math.pow(radius, 2);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

