package Class_Functionals.Classes_UML.Circle_Simplified;


public class test_Circle_Simplified {
    public static void main(String[] args) {

        Circle_Simplified object = new Circle_Simplified();
        Circle_Simplified object_1 = new Circle_Simplified(5.2);

        System.out.println(object);
        System.out.println(object_1);
        System.out.println(object.getRadius());
        System.out.println(object_1.getRadius());
        object.setRadius(2.3);
        System.out.println(object.getArea());
        System.out.println(object_1.getArea());
        System.out.println(object.getCircumference());
        System.out.println(object_1.getCircumference());
        System.out.println(object.toString());
        System.out.println(object_1.toString());
    }
}
