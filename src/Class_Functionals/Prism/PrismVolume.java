package Class_Functionals.Prism;

import Class_Functionals.Triangle.Triangle;

public class PrismVolume {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(3, 4, 5);
        Prism prism = new Prism(triangle, 75);
        System.out.println(prism.volume());
    }
}
