package Class_Functionals.Classes_UML.Circle;

public class test_Circle {

    public static void main(String[] args) {

        Circle object = new Circle();
        Circle object_1 = new Circle(5.6);
        Circle object_2 = new Circle(5.8, "black");

        System.out.println(object);
        System.out.println(object_1);
        System.out.println(object_2);
        System.out.println(object.getRadius());
        System.out.println(object_1.getRadius());
        System.out.println(object_2.getRadius());
        System.out.println(object.getColor());
        System.out.println(object_1.getColor());
        System.out.println(object_2.getColor());
        object.setRadius(2.6);
        object_1.setRadius(2.7);
        object_2.setRadius(2.8);
        object.setColor("orange");
        object_1.setColor("white");
        object_2.setColor("grey");
        System.out.println(object.toString());
        System.out.println(object_1.toString());
        System.out.println(object_2.toString());
        System.out.println(object.getArea());
        System.out.println(object_1.getArea());
        System.out.println(object_2.getArea());
    }
}
