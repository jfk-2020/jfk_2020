package Class_Functionals.Triangle;

import Class_Functionals.Rectangle.Rectangle;

public class TriangleAreas {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(5, 6);
        Triangle triangle_2 = new Triangle(5, 6, 9);


        System.out.println(triangle.аrеа());
        System.out.println(triangle_2.sidesSum());
    }
}
