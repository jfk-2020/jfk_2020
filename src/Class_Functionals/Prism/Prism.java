package Class_Functionals.Prism;

import Class_Functionals.Triangle.Triangle;

public class Prism {

    private Triangle triangle;
    private int height;

    public Prism(Triangle tr, int h) {
        triangle = tr;
        height = h;
    }

    public double volume() {
        return triangle.аrеа() * height;
    }
}
